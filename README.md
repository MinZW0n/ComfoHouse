# ComfoHouse

가구와 같은 인테리어 상품을 판매하는 쇼핑몰 사이트 개발 프로젝트

엘리스 cloud 트랙 2차 프로젝트
프로젝트 진행 기간 : 20240219 ~ 20240315

# 학습방식, 모임

매일 19시에 디스코드를 이용해 스크럼 진행


# 도메인 주소



# 역할

- 고상현
  * order



- 남지원
  * product



- 민지원
  * 회원가입
  * 로그인
  * 유저 페이지, 어드민 페이지



- 박웅서
  * 배포







## 기술 스택

[![stackticon](https://firebasestorage.googleapis.com/v0/b/stackticon-81399.appspot.com/o/images%2F1710419977933?alt=media&token=29d5cc6f-d4fa-4679-806a-4bb2501a018a)](https://github.com/msdio/stackticon)


## 주요기능



## 구조

📦src  
┣ 📂main  
┃ ┣ 📂java  
┃ ┃ ┣ 📂io  
┃ ┃ ┃ ┣ 📂elice  
┃ ┃ ┃ ┃ ┣ 📂shoppingmall  
┃ ┃ ┃ ┃ ┃ ┣ 📂aspect  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GlobalExceptionHandler.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoggingAspect.java  
┃ ┃ ┃ ┃ ┃ ┣ 📂auth  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtAuthenticationFilter.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtAuthenticationProvider.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜JwtAuthenticationToken.java  
┃ ┃ ┃ ┃ ┃ ┣ 📂cart  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CartController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CartItemController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CartItemResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CartItemUpdateDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CartResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Cart.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CartItem.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CartItemRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CartRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CartItemService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CartService.java  
┃ ┃ ┃ ┃ ┃ ┣ 📂category  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CategoryController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CategoryRequestDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CategoryResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Category.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CategoryRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CategoryFileService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CategoryService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜.DS_Store  
┃ ┃ ┃ ┃ ┃ ┣ 📂config  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜KeyConfig.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityConfig.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebMvcConfig.java  
┃ ┃ ┃ ┃ ┃ ┣ 📂order  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderDetailController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderDetailRequestDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderDetailResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderDetailUpdateDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderManagerUpdateDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderRequestDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderUpdateDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂model  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderDetail.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Orders.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderDetailRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderDetailService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜.DS_Store  
┃ ┃ ┃ ┃ ┃ ┣ 📂product  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OptionController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OptionRequestDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OptionResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRequestDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ReviewRequestDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewResponseDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Option.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Product.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Review.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OptionRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OptionService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductFileService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜.DS_Store  
┃ ┃ ┃ ┃ ┃ ┣ 📂swagger  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SwaggerConfig.java  
┃ ┃ ┃ ┃ ┃ ┣ 📂user  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂Dto  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeleteDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SignInDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SignUpDto.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserController.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜User.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRepository.java  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜.DS_Store  
┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store  
┃ ┃ ┃ ┃ ┃ ┗ 📜ShoppingMallApplication.java  
┃ ┃ ┃ ┃ ┗ 📜.DS_Store  
┃ ┃ ┃ ┗ 📜.DS_Store  
┃ ┃ ┗ 📜.DS_Store  
┃ ┣ 📂resources  
┃ ┃ ┣ 📂static  
┃ ┃ ┃ ┣ 📂account  
┃ ┃ ┃ ┃ ┣ 📜account.css  
┃ ┃ ┃ ┃ ┣ 📜account.html  
┃ ┃ ┃ ┃ ┗ 📜account.js  
┃ ┃ ┃ ┣ 📂account-orders  
┃ ┃ ┃ ┃ ┣ 📜account-orders.css  
┃ ┃ ┃ ┃ ┣ 📜account-orders.html  
┃ ┃ ┃ ┃ ┗ 📜account-orders.js  
┃ ┃ ┃ ┣ 📂account-security  
┃ ┃ ┃ ┃ ┣ 📜account-security.css  
┃ ┃ ┃ ┃ ┣ 📜account-security.html  
┃ ┃ ┃ ┃ ┗ 📜account-security.js  
┃ ┃ ┃ ┣ 📂account-signout  
┃ ┃ ┃ ┃ ┣ 📜account-signout.css  
┃ ┃ ┃ ┃ ┣ 📜account-signout.html  
┃ ┃ ┃ ┃ ┗ 📜account-signout.js  
┃ ┃ ┃ ┣ 📂admin  
┃ ┃ ┃ ┃ ┣ 📜admin.css  
┃ ┃ ┃ ┃ ┣ 📜admin.html  
┃ ┃ ┃ ┃ ┗ 📜admin.js  
┃ ┃ ┃ ┣ 📂admin-orders  
┃ ┃ ┃ ┃ ┣ 📜admin-orders.css  
┃ ┃ ┃ ┃ ┣ 📜admin-orders.html  
┃ ┃ ┃ ┃ ┗ 📜admin-orders.js  
┃ ┃ ┃ ┣ 📂admin-users  
┃ ┃ ┃ ┃ ┣ 📜admin-users.css  
┃ ┃ ┃ ┃ ┣ 📜admin-users.html  
┃ ┃ ┃ ┃ ┗ 📜admin-users.js  
┃ ┃ ┃ ┣ 📂cart  
┃ ┃ ┃ ┃ ┣ 📜cart.css  
┃ ┃ ┃ ┃ ┣ 📜cart.html  
┃ ┃ ┃ ┃ ┗ 📜cart.js  
┃ ┃ ┃ ┣ 📂category-add  
┃ ┃ ┃ ┃ ┣ 📜category-add.css  
┃ ┃ ┃ ┃ ┣ 📜category-add.html  
┃ ┃ ┃ ┃ ┗ 📜category-add.js  
┃ ┃ ┃ ┣ 📂home  
┃ ┃ ┃ ┃ ┣ 📜home.css  
┃ ┃ ┃ ┃ ┣ 📜home.html  
┃ ┃ ┃ ┃ ┗ 📜home.js  
┃ ┃ ┃ ┣ 📂login  
┃ ┃ ┃ ┃ ┣ 📜login.css  
┃ ┃ ┃ ┃ ┣ 📜login.html  
┃ ┃ ┃ ┃ ┗ 📜login.js  
┃ ┃ ┃ ┣ 📂order  
┃ ┃ ┃ ┃ ┣ 📜order.css  
┃ ┃ ┃ ┃ ┣ 📜order.html  
┃ ┃ ┃ ┃ ┗ 📜order.js  
┃ ┃ ┃ ┣ 📂order-complete  
┃ ┃ ┃ ┃ ┣ 📜order-complete.css  
┃ ┃ ┃ ┃ ┣ 📜order-complete.html  
┃ ┃ ┃ ┃ ┗ 📜order-complete.js  
┃ ┃ ┃ ┣ 📂page-not-found  
┃ ┃ ┃ ┃ ┗ 📜page-not-found.html  
┃ ┃ ┃ ┣ 📂product-add  
┃ ┃ ┃ ┃ ┣ 📜product-add.css  
┃ ┃ ┃ ┃ ┣ 📜product-add.html  
┃ ┃ ┃ ┃ ┗ 📜product-add.js  
┃ ┃ ┃ ┣ 📂product-detail  
┃ ┃ ┃ ┃ ┣ 📜product-detail.css  
┃ ┃ ┃ ┃ ┣ 📜product-detail.html  
┃ ┃ ┃ ┃ ┗ 📜product-detail.js  
┃ ┃ ┃ ┣ 📂product-list  
┃ ┃ ┃ ┃ ┣ 📜product-list.css  
┃ ┃ ┃ ┃ ┣ 📜product-list.html  
┃ ┃ ┃ ┃ ┗ 📜product-list.js  
┃ ┃ ┃ ┣ 📂register  
┃ ┃ ┃ ┃ ┣ 📜register.css  
┃ ┃ ┃ ┃ ┣ 📜register.html  
┃ ┃ ┃ ┃ ┗ 📜register.js  
┃ ┃ ┃ ┣ 📜api.js  
┃ ┃ ┃ ┣ 📜aws-s3.js  
┃ ┃ ┃ ┣ 📜elice-rabbit-favicon.png  
┃ ┃ ┃ ┣ 📜elice-rabbit.png  
┃ ┃ ┃ ┣ 📜indexed-db.js  
┃ ┃ ┃ ┣ 📜navbar.js  
┃ ┃ ┃ ┗ 📜useful-functions.js  
┃ ┃ ┣ 📜application.properties  
┃ ┃ ┗ 📜application.yml  
┃ ┗ 📜.DS_Store



## 트러블 슈팅


- 초기 회원가입을 진행할 때 이메일 중복 가입이 가능해서 회원 정보를 찾아올 때
  오류가 생겨버려 회원가입시 이메일 중복체크 하는 api를 만들어 해결했다.

- 로컬에서 테스트 했을 시 잘 되던 api가 CORS 오류로 컨트롤러를 거치지 못해
  컨트롤러에 @CrossOrigin을 넣어 해결했다.


## 개인 소감

- 고상현
  



- 남지원
  



- 민지원 : 백엔드 하나만으로도 이것저것 찾아가면서 해야할 게 많은데 프론트까지 하려고 하니까 시간이 더 오래 걸렸고
이번 프로젝트를 해보면서 배포를 통해 서버가 어떤 구조로 돌아가는지 감이 조금 왔고 공부를 더 해야겠다고 생각했다

  



- 박웅서
  


