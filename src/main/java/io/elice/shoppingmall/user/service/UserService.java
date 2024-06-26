package io.elice.shoppingmall.user.service;


import io.elice.shoppingmall.user.Dto.DeleteDto;
import io.elice.shoppingmall.user.Dto.SignUpDto;
import io.elice.shoppingmall.user.entity.User;
import io.elice.shoppingmall.user.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
   private final Key key;
    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder, Key key) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.key = key;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User signUp(SignUpDto signUpDto){
        User user = User.builder()
                        .email(signUpDto.getEmail())
                        .password(signUpDto.getPassword())
                        .nickname(signUpDto.getNickname())
                        .address1(signUpDto.getAddress1())
                        .address2(signUpDto.getAddress2())
                        .postcode(signUpDto.getPostcode())
                        .phoneNumber(signUpDto.getPhoneNumber())
                        .isAdmin(signUpDto.isAdmin())
                        .build();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public boolean checkEmail(String email){
        return userRepository.existsByEmail(email);
    }



    public User authenticate(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    public String generateJwtToken(User user) {
        return Jwts.builder()
                .setSubject(user.getEmail())
                .claim("isAdmin", user.isAdmin()) // isAdmin 정보 추가
                .setIssuedAt(new Date())
                .signWith(key)
                .compact();
    }

    @Transactional
    public User updateUser(Long id, SignUpDto signUpDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 존재하지 않습니다. id=" + id));
        if(signUpDto.getNickname() != null) {
            if (!user.getNickname().equals(signUpDto.getNickname())) {
                user.setNickname(signUpDto.getNickname());
            }
        }
        if(signUpDto.getPassword() != null){
            user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        }
        if(signUpDto.getPostcode() != null) {
            if (!user.getPostcode().equals(signUpDto.getPostcode())) {
                user.setPostcode(signUpDto.getPostcode());
            }
        }
        if(signUpDto.getAddress1() != null) {
            if (!user.getAddress1().equals(signUpDto.getAddress1())) {
                user.setAddress1(signUpDto.getAddress1());
            }
        }
        if(signUpDto.getAddress2() != null){
            if(!user.getAddress2().equals(signUpDto.getAddress2())){
                user.setAddress2(signUpDto.getAddress2());
            }
        }
        if(signUpDto.getPhoneNumber() != null) {
            if (!user.getPhoneNumber().equals(signUpDto.getPhoneNumber())) {
                user.setPhoneNumber(signUpDto.getPhoneNumber());
            }
        }
        return userRepository.save(user);
    }

    public boolean checkPassword(DeleteDto deleteDto) {
        User user = userRepository.findById(deleteDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 존재하지 않습니다."));
        return passwordEncoder.matches(deleteDto.getPassword(), user.getPassword());
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Page<User> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public User updateRole(Long id, boolean isAdmin) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 존재하지 않습니다."));
        user.setAdmin(isAdmin);
        return userRepository.save(user);
    }

    public int getUserCount() {
        return (int) userRepository.count();
    }

    public int getAdminCount() {
        return userRepository.countByIsAdmin(true);
    }
}
