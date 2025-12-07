# **성결대학교 미디어소프트웨어학과 자바웹프로그래밍(2)**

- 성결대학교 미디어소프트웨어 20220970 김동준

## **수업 실습 활동**
### **1. 백엔드 프로그래밍, 스프링 프레임워크 (2주차)**

• 스프링 부트 다운로드, 자바 v21, JDK 설치  
• 새로운 스프링 부트 프로젝트 설정, 메인 부트 설정, resource/templates/index.html 생성  
• URI, URL, DispatcherServlet(프론트 컨트롤러), DemoController 생성  
• 컨트롤러 수정, URL 매핑 (index-hello1-hello2)  

---
### **2. 웹 트렌드, 나만의 포트폴리오 제작 (3주차)**

• JAVA와 C# 비교, 스프링 부트 스택이란  
• 포트폴리오 템플릿을 사용하여 나만의 포트폴리오 제작  
• 일부 수정 및 '상세 소개(about detailed)' 링크 추가  

---
### **3. 데이터베이스 (4주차)**

• 프로필 수정(기술 경험 내용 수정)  
• 데이터베이스(MySQL) 다운로드 및 설치  
• 데이터베이스 연동  
• 프로젝트 폴더 구조 확인 및 패키지 세분화(MVC, Service, Repository)  
• SQL쿼리에 직접 INSERT를 통해서 testdb 작동 확인  

---
### **4. 블로그, 게시글과 데이터베이스 연결 (5주차)**

• 블로그 페이지 제작  
• 블로그 게시판 매뉴 및 링크 등록    
• 블로그 게시판 작성, 등록 (스프링부트를 통해서 동작하기에 컨트롤러에 등록)  
• 엔티티 클래스, 리포지토리 클래스, 서비스 클래스 추가  
• 컨트롤러 게시판 요청, 응답 기능 추가  
• 'AddArticleRequest.java'를 통해 DTO(Data Transfer Object) 구현  
• 컨트롤러에 'favicon.ico' 에러 방지  

---
### **5. ORM이란?, ORM 매핑과 엔티티 매니저 (7주차)**

• 게시글 수정과 삭제 기능 구현  
• 게시글 목록 아래 수정, 삭제 버튼 추가  
• 'article.html'생성 및 controller 맵핑 등록 (Get, Put, Delete) 
• 서비스 클래스 추가, 'Article.java'의 엔티티 글래스 수정  
• 애플리케이션 설정 추가 및 삭제 버튼 html 수정  
• 게시판 수정화면으로 직접 이동시에 에러 페이지 발생 (예외처리)  

---
### **6. 중간고사 공지 (8주차)**

• 중간고사 공지 및 중간점검  
• 깃허브 메일 제출  

---
### **7. 중간고사 당일 (9주차)**

• 중간고사  

---
### **8. 프로필, 게시판 수정하기 (10주차)**

• 프로필 '나의 프로젝트'란 수정  
• 한글화 및 사진 변경  
• 게시판 프론트 디자인 수정  
• 게시판 페이지 분리  
• 새 게시판 DB 및 필드 추가 (user, newdate, count, likec)  
• 게시판 내용 확인 하이퍼링크 추가  
• 게시글 수정, 삭제 버튼 추가  

---
### **9. 검색창과 페이징 (11주차)**

• 'board_write'를 통해서 새로운 페이지 에서 글쓰기 기능 추가  
• 'board_list' 메인화면 상단에 검색창과 검색 기능 추가  
• 페이징 퍼리를 위한 서비스 계층의 코드를 수정  
• Jpa 연동  
• 한 화면에 뜨는 게시글 제한  
• 네비바 형태로 페이징 기능 추가

---
### **10. 로그인과 로그아웃_1 (12주차)**

• 'SecurityConfig'를 통해서 보안 설정을 등록  
• 'domain'-'Member' 생성하여 회원 저장 테이블 구성  
• Blog와 구분하기 위한 새로운 'MemberController.java' 생성  
• 프론트 생성 'join_new.html'  
• 리포지토리, 서비스 DTO 구성  
• 회원가입 완료후 'join_end.html'를 통한 완료 프론트, 리다이렉트  
• 로그인 프론트 및 컨트롤러 맵핑 Get, Post 요청  

---
### **11. 로그인과 로그아웃_2 (13주차)**

• 프로젝트 팀원 사진 및 정보 수정  
• 추천인/전문가 후기 수정  
• 'BlogController.java'수정, 로그인 X -> 게시판 접근 X  
• 로그인시 세션 ID를 생성  
• 로그인 후 게시판에 사용자 환영합니다 출력  
• 세션 존재시 초기화를 통해서 단일 사용자만 로그인 할 수 있도록 함  
• 로그아웃 버튼 구현 'MemberController.java' 수정  
• 'SecurityConfig.java' 수정을 통한 보안기능 추가 (xss, csrf, 세션 제한 등)  
• 'application.properties' 수정을 통한 세션 만료 기능 추가  
• 'session-expired'가 되면 화이트라벨 오류 발생!  

*session_expired.html 생성 (join_end.html 재활용)*
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <title>session expired</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container text-center mt-5">
            <h1 class="mb-4 text-success">세션 만료</h1>
            <a href="/">홈으로돌아가기</a>
        </div>
    </body>
</html>
```
*BlogController.java에 맵핑*
```java
@GetMapping("/session-expired")
public String session_expried() {
    return "session_expired";
}
```
![세션 만료시 되돌아가기](/src/main/resources/static/img/ssexp.png)  
*세션 만료시 되돌아가기*  
• '홈으로돌아가기'를 통해 본 페이지로 이동  

---
### **12. 포트폴리오 완성 (14주차)**

• 'index.html'의 주소 및 연락처 부분 번역 및 수정  
• 추가로 메일 업로드 기능으로 수정  
• 'FileController.java'추가  
• 'Securityconfig.java' 수정 -> CSRF 비활성화(여가서만 하는 조치로 보안에 매우 취약)  
• 파일 업로드 저장소 및 완료 화면 추가  
  
*동작 확인*  
![upload에 저장된 파일과 txt 내용](/src/main/resources/static/img/savetest.png)  
*upload에 저장된 파일과 txt 내용*  

• 지도 학교 위치로 설정하기(google map)  
!['index.html'화면 지도 내용](/src/main/resources/static/img/maptest.png)  
*'index.html'화면 지도 내용*  

- 'index.html'의 제공 서비스 부분 연락하기 버튼을 연락폼으로 이동  
```html
<a class="btn btn-primary py-3 px-5" href="#contact">연락하기</a>
```
- 포트폴리오 'index.html' 편집 완료  

---
## 연습 문제 (모든 문제 풀이 완료)
### **2주차: URL 맵핑과 컨트롤러 추가하기 (完了)**

• 수업중 제작한 'hello.html'를 이용하여 'hello2.html'생성 및 'DemoController.java'에 url 맵핑

*DemoController.java에 맵핑 추가*
```JAVA
@GetMapping("/hello2")
public String hello2() {
    return "hello2";
}
```

---
### **3주차: 상세 페이지 수정하기 (完了)**

• 'about_detailed.html'의 되돌아가기 버튼을 누르면 창을 닫을지 물어보고, Y/N를 통해서 동작할 수 있도록 한다.

• 먼저 'main.js'를 수정한다
```JAVASCRIPT
function confirmClose() {
    const closecall = window.confirm("되돌아가시겠습니까?");
    if (closecall) {
        window.close();
    }
}
```

• 다음 'about_detailed.html'의 되돌아가기 버튼 부분을 수정한다
```HTML
<div class="col-lg-6 text-lg-end">
    <a class="btn btn-primary py-3 px-5" onclick="confirmClose()" href="/index">되돌아가기</a>
</div>
```

• 동작 확인

![confirmClose()](/src/main/resources/static/img/yesorno.png "confirmClose()")
*confirmClose()*  

---
### **4주차: 사용자 추가 및 출력하기 (完了)**

• VS CODE의 MySQL 확장을 사용하여 사용자를 DB에 직접 추가한다.

• 컨트롤러에 사용자 2, 3을 추가한다

*DemoController.java*
```JAVA
@GetMapping("/testdb")
public String getAllTestDBs(Model model) {
TestDB test = testService.findByName("홍길동");
model.addAttribute("data4", test);
System.out.println("데이터 출력 디버그 : " + test);

TestDB test2 = testService.findByName("아저씨");
model.addAttribute("data5", test2);
System.out.println("데이터 출력 디버그 : " + test2);

TestDB test3 = testService.findByName("꾸러기");
model.addAttribute("data6", test3);
System.out.println("데이터 출력 디버그 : " + test3);
    return "testdb";
}
```

• 뷰를 수정한다.

*testdb.html*
```HTML
<body>
    <h1>User List</h1>
    <p>아이디(기본키) : <span th:text="${data4.id}"></span></p>
    <p>이름 : <span th:text="${data4.name}"></span></p>
    <p>아이디(기본키) : <span th:text="${data5.id}"></span></p>
    <p>이름 : <span th:text="${data5.name}"></span></p>
    <p>아이디(기본키) : <span th:text="${data6.id}"></span></p>
    <p>이름 : <span th:text="${data6.name}"></span></p>
</body>
```

• MySQL 테이블 예시
![사용자 추가](/src/main/resources/static/img/fstdb.png)
*사용자 추가*  

---
### **5주차: 페이지 리다이렉트 (完了)**

- 리다이렉트란 사용자가 처음 요청한 URL이 아닌, 다른 URL로 보내는 것

• 기존 @BlogRestController방식을 BlogController 방식으로 수정

• BlogController.java에 맵핑 추가 (리턴 타입: String)
```JAVA
@PostMapping("/api/articles")
public String addArticle(@ModelAttribute AddArticleRequest request) {
    Article saveArticle= blogService.save(request);
    ResponseEntity.status(HttpStatus.CREATED).body(saveArticle);
    return "redirect:/article_list"; 
}
```

---
### **7주차: 예외처리 (完了)**

• 수업중 진행했던 'article_error.html'을 재사용하여 'add_error.html'생성

• 'BlogErrorHandler.java' 생성
```JAVA
@ControllerAdvice
public class BlogErrorHandler {
    @ExceptionHandler({MethodArgumentTypeMismatchException.class, IllegalArgumentException.class})
    public String handleException(Exception ex, Model model) {
        model.addAttribute("errorMessage", "잘못된 요청입니다: " + ex.getMessage());
        return "error_page/add_error";
    }
}
```

• 'templates'폴더에 추가로 'error_page'생성 (에러 페이지만 관리하기 위함)

• 에러 페이지 동작 예시
![에러 페이지 동작 예시](/src/main/resources/static/img/error1.png)
*에러 페이지 동작 예시*  


---
### **10주차:  새로운 게시판 페이지 만들기(完了)**

• 수업중 진행했던 'article_edit.html'을 재사용하여 'board_edit.html'생성  
• 글수정 및 삭제 버튼 동작을 위한 맵핑 등록 (BlogController.java)  
• 'AddArticleRequest.java'수정  
```JAVA
public Board toEntity(){
    return Board.builder()
        .title(title)
        .content(content)
        .user(user)
        .newdate(newdate)
        .count(count)
        .likec(likec)
        .build();
    }
```

• 'BlogService.java'수정(글 수정)  
```JAVA
public void update(Long id, AddArticleRequest request) {
    Optional<Board> optionalBoard = blogRepository2.findById(id); 
        optionalBoard.ifPresent(board -> { 
        board.update(request.getTitle(), request.getContent(), board.getUser(), board.getNewdate(), board.getCount(), board.getLikec()); 
        blogRepository2.save(board); 
    });
}
```

• 'BlogService.java'수정(글 삭제)  
```JAVA
public void delete(Long id) {
    blogRepository2.deleteById(id);
}
```

---
### **11주차:  게시판 페이지 글 번호 & 삭제(完了)**

• 데이터베이스의 id 값 대신 순서 출력 구현  
• 'BlogController.java'수정  
```JAVA
int startNumber = (page * 5) + 1;
model.addAttribute("startNumber", startNumber);
```
• 'Board.java' 수정
```JAVA
@Column(name = "startNumber", nullable = false)
private int startNumber = 0;
```
```JAVA
@Builder
public Board(int startNumber, String title, ~~~){
this.startNumber = startNumber;
~~~
}
```
```JAVA
public void update(int startNumber, ~~~) {
this.startNumber = startNumber;
~~~
}
```
• 'BlogService.java'수정
```JAVA
board.update(board.getStartNumber() ,request.getTitle(), request.getContent(), board.getUser(), board.getNewdate(), board.getCount(), board.getLikec());
```
• 'board_list.html 수정
```HTML
<tr th:each="board, stat : ${boards}">
    <td th:text ="${startNumber + stat.index}"></td>
    <td>
        <a th:href="@{/board_view/{id}(id=${board.id})}">
            <span th:text="${board.title}"></span>
        </a>
    </td>
```

• 게시판 페이지 삭제
• 'BlogController.java' 수정
```JAVA
@DeleteMapping("/api/board_delete/{id}")
public String deleteBoard(@PathVariable Long id) {
    blogService.delete(id);
    return "redirect:/board_list";
}
```
---
### **12주차:  입력값 필터링(完了)**

• pom.xml에 'Validation' 의존성 모듈 추가  
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
``` 
---
### 검증처리

| 항목            | 제한                                             |
|--------------------|-------------------------------------------------------|
| `이름`      | 공백 X, 특수문자 X                         |
| `이메일`  | 공백 X, 이메일 형식                     |
| `패스워드`  | 패턴 O (8글자이상, 대소문자 포함)                     |
| `나이`  | 패턴 O (19세 이상부터 90세 이하까지)                     |
| `모바일`  | 공백 O                     |
| `주소`  | 공백 O                     |
---
### 검증처리 어노테이션

| 어노테이션            | 설명                                                                 |
|-----------------------|----------------------------------------------------------------------|
| `@Null`               | null만 허용한다.                                                    |
| `@NotNull`            | 빈 문자열(`""`), 공백(`" "`)은 허용하되, null은 허용하지 않는다.     |
| `@NotEmpty`           | 공백(`" "`)은 허용하되, null과 빈 문자열(`""`)은 허용하지 않는다.    |
| `@NotBlank`           | null, 빈 문자열(`""`), 공백(`" "`) 모두 허용하지 않는다.            |
| `@Email`              | 이메일 형식을 검사한다. 단, 빈 문자열(`""`)의 경우엔 통과 시킨다.   |
| `@Pattern(regexp = )` | 정규식 검사를 할 때 사용한다.                                       |
| `@Size(min=, max=)`   | 길이를 제한할 때 사용한다.                                          |
| `@Max(value = )`      | value 이하의 값만 허용한다.                                          |
| `@Min(value = )`      | value 이상의 값만 허용한다.                                          |

---

- 'AddMemberRequest.java' 검증처리
```JAVA
@NotBlank(message = "이름을 입력하십시오")
@Size(min = 2, max = 50, message = "이름은 2자 이상 50자 이하여야 합니다.")
private String name;

@Email(message = "이메일 형식이 올바르지 않습니다.")
@NotBlank(message = "이메일을 입력하십시오")
private String email;

@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,20}$",
            message = "비밀번호는 8~20자이며, 영문자, 숫자, 특수문자를 포함해야 합니다.")
private String password;

@Pattern(regexp = "^(19|[2-8][0-9]|90)$", message = "나이는 19세에서 90세 사이여야 합니다.")
private String age;

@NotEmpty(message = "휴대폰 번호를 입력하십시오")
private String mobile;

@NotEmpty(message = "주소를 입력하십시오")
private String address;
```
- 'MemberController.java' 수정
```JAVA
@PostMapping("/api/members")
public String addmembers(@Valid @ModelAttribute AddMemberRequest request, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
        model.addAttribute("addMemberRequest", request);
        return "join_new";
    }
    memberService.saveMember(request);
    return "join_end";
}
```
- 'join_new.html'에서 'AddMemberRequest'를 찾을 수 있게 함  
(이걸 안 해서 500에러가 발생, 약 2시간의 삽질을 경험할 수 있었음)
```java
    @GetMapping("/join_new")
    public String join_new(Model model) {
        model.addAttribute("addMemberRequest", new AddMemberRequest());
        return "join_new";
    }
```
- 'join_new.html'에 'addMemberRequrest' 추가
```html
<form th:action="@{/api/members}" th:object="${addMemberRequest}" method="post">
```
- 오류 작동 조건 및 설정
```html
<span th:if="${#fields.hasErrors('password')}" th:errors="*{password}" style="color:red"></span>
```
- 동작 확인
![비밀번호, 나이 오류](/src/main/resources/static/img/join_error_test.png)
*비밀번호, 나이 오류*  

---
### **13주차:  게시판 수정하기(完了)**
- 게시글 추가(글 저장하기)에서 현재 로그인한 사용자로 글의 작성자를 저장한다
*BlogController.java 수정*
```java
@PostMapping("/api/boards")
public String addboards(@ModelAttribute AddArticleRequest request, HttpSession session) {
    String email = (String) session.getAttribute("email"); // 세션에서 이름 확인
    System.out.println("작성자: " + email); //터미널 확인용
    request.setUser(email);
    blogService.save(request);
    return "redirect:/board_list";
}
```
![기존 GUEST 아래 이메일로 저장된 모습](/src/main/resources/static/img/bidtest.png)
*기존 GUEST 아래 이메일로 저장된 모습*  


- 게시글 내용 보기에서 글의 작성자만 수정/삭제 버튼을 보여준다  
*BlogController.java' 수정*  
```java
@PutMapping("api/board_edit/{id}")
public String updataBoard(@PathVariable Long id, @ModelAttribute AddArticleRequest request, HttpSession session) {
    String email = (String) session.getAttribute("email"); // 세션에서 이름 확인
    Optional<Board> list = blogService.findById(id);
    Board board = list.get();
    if (!board.getUser().equals(email)) {
        return "redirect:/board_list?error=unauthorized";
    }
    blogService.update(id, request);
    return "redirect:/board_list";
}
```
- @DeleteMapping도 동일한 방법으로 진행한다  
*qwer1234@qqq.com으로 로그인 되었을때 시연 사진*  

![같은계정 글](/src/main/resources/static/img/qqqtest.png)  
*같은계정 글*  

![다른계정 글](/src/main/resources/static/img/jintest.png)
*다른계정 글*  

---
### **14주차:  세션 처리, 파일 업로드(完了)**
- 세션처리: 2명 이상 로그인 되도록 코드 수정  
- 로그인 사용자마다 다른 이름 세션을 생성, 로그아웃시 현재 사용자의 세션과 쿠키만 삭제  

*2개 세션 로그인시*  
![2개 세션 로그인](/src/main/resources/static/img/img1test.png)  
*2개 세션 로그인*  

*한개의 세션에서 로그아웃 시*  
![한쪽에서 로그아웃](/src/main/resources/static/img/img2test.png)  
*한쪽에서 로그아웃*  


*로그아웃 코드 구현*  
```java
if (session != null) {
    session.invalidate();
}
Cookie[] cookies = request2.getCookies();
if (cookies != null) {
    for (Cookie cookie: cookies){
        if ("JSESSIONID".equals(cookie.getName())) {
            cookie.setValue(null);
            cookie.setMaxAge(0);
            cookie.setPath("/"); 
            response.addCookie(cookie);
            session =request2.getSession(true);
        }
    }
}
```

- 동일 파일 업로드 시 다른 이름으로 생성하여 중복 방지  
```java
int count = 1;
while (Files.exists(filePath)) {
    filePath = uploadPath.resolve(sanitizedEmail + "(" + count + ").txt");
    count++;
}
```
*if 구문을 사용하였을 시 (1) 이후로는 생성되지 않아서 while 문을 사용하여 구현  
*동작확인을 위한 로컬 저장소 확인*  
![파일명과 내용에서 qqq.com 뒤로 붙는 숫자를 보면 이해가 편합니다](/src/main/resources/static/img/myfitest.png)  
*파일명과 내용에서 qqq.com 뒤로 붙는 숫자를 보면 이해가 편합니다*  

- 파일 업로드 에러 페이지 처리  
- 'page_error.html'생성  
- 기존 'article_error.html'을 재활용하여 내용만 수정해서 사용  
- 'FileController.java'의 IOExcption return 경로 수정 및 추가 오류 발생점 추가  
```java
if (subject == null || subject.trim().isEmpty()) {
    redirectAttributes.addFlashAttribute("message", "제목을 입력해주세요.");
return "/error_page/page_error";
}
if (message == null || message.trim().isEmpty()) {
    redirectAttributes.addFlashAttribute("message", "메시지를 입력해주세요.");
return "/error_page/page_error";
}
```
![공란 입력시 'page_error.html'로 리다이렉트](/src/main/resources/static/img/paertest.png)  
*공란 입력시 'page_error.html'로 리다이렉트*  


---
## **수업 내용 정리**
### **1. 백엔드 프로그래밍, 스프링 프레임워크 (2주차)**

- JVM 및 WAS(Web Application Server)의 역할과 구조
- Spring Boot 애플리케이션 기본구성 `@SpringBootApplication`
- Controller, View Controller, Rest Controller 구분
- URL 매핑 : `@RequestMapping`, `@GetMapping`, `@PostMapping` 등
- DispatcherServlet의 요청 흐름과 역할
- MVC 패턴 모델링(Model, View, Controller 분리)
- Thymeleaf 템플릿 엔진 활용법

---
### **2. 웹 트렌드, 나만의 포트폴리오 제작 (3주차)**

- C, JAVA, C# 비교, JVM과 .NET Framework 차이
- IDE 사용법 및 verbose 옵션 이해
- HTML, CSS, Javascript와 서버 연동 원리

---
### **3. 데이터베이스 (4주차)**

- MySQL 8, JPA 기반 ORM 구성
- Repository, Service, Controller 계층 구조
- DTO를 통한 데이터 전송 구조 구현 (AddArticleRequest 등)
- 기본 CRUD 예시와 Thymeleaf 뷰 연동 예제

```java
@GetMapping("/testdb")
public String getAllTestDBs(Model model) {
    TestDB user = testService.findByName("홍길동");
    model.addAttribute("data", user);
    return "testdb";
}
```

---
### **4. 블로그, 게시글과 데이터베이스 연결 (5주차)**

- REST 의미와 HTTP CRUD 매핑 (POST, GET, PUT, DELETE)
- URL 구조 설계와 파라미터 사용법(`@RequestParam`, `@PathVariable` 등)
- JSON 데이터 변환 및 처리


---
### **5. ORM이란?, ORM 매핑과 엔티티 매니저 (7주차)**

- ORM 개념 및 구현체(Hibernate, JPA)
- Entity 클래스와 Repository 사용법
- EntityManager, SQL 추상화 이해
- Thymeleaf 반복 및 조건문 활용 예

```html
<a th:href="@{/article/edit/{id}(id=${article.id})}" class="btn btn-warning">수정</a>
```

- @ControllerAdvice와 @ExceptionHandler 예외 처리
- 에러 페이지 분리 관리 및 사용자 친화적 메시지 표시

```java
@ControllerAdvice
public class BlogErrorHandler {
    @ExceptionHandler({MethodArgumentTypeMismatchException.class, IllegalArgumentException.class})
    public String handleException(Exception ex, Model model) {
        model.addAttribute("errorMessage", "잘못된 요청입니다: " + ex.getMessage());
        return "error_page/add_error";
    }
}
```


---
### **6. 중간고사 공지 (8주차)**

- 중간고사 공지 및 중간점검  
- 깃허브 메일 제출  

---

### 꼭 알고 넘어갈 것

### 클래스 역할

- Controller: HTTP 요청을 받고 적절한 서비스 호출 및 뷰 반환
- Service: 비즈니스 로직 처리
- Repository: DB 접근 및 CRUD 처리
- DTO (Data Transfer Object): 계층 간 데이터 전달 역할

---

### 전용 메소드 역할

- `@GetMapping`: GET 요청 처리 메소드
- `@PostMapping`: POST 요청 처리 메소드
- `@PutMapping`: PUT 요청 처리 메소드
- `@DeleteMapping`: DELETE 요청 처리 메소드

각 메소드는 HTTP 요청 메서드 구분과 URL 매핑 기능을 수행

---

### 파라미터 역할

- `@RequestParam`: URL 쿼리 스트링 파라미터 수신
- `@PathVariable`: URL 경로 변수 수신
- `@ModelAttribute`: 폼 데이터나 여러 파라미터를 객체 단위로 매핑
- `@RequestBody`: HTTP 요청 바디의 JSON, XML 데이터를 자바 객체로 매핑

---

### 어노테이션 종류별 역할

| 어노테이션            | 역할 및 설명                                             |
|--------------------|-------------------------------------------------------|
| `@Controller`      | MVC에서 컨트롤러 역할, 뷰 반환 시 사용                         |
| `@RestController`  | REST API에서 JSON 등 데이터를 반환할 때 사용                     |
| `@GetMapping`      | HTTP GET 요청을 처리하는 메소드에 사용                          |
| `@PostMapping`     | HTTP POST 요청을 처리하는 메소드에 사용                         |
| `@PutMapping`      | HTTP PUT 요청을 처리하는 메소드에 사용                          |
| `@DeleteMapping`   | HTTP DELETE 요청을 처리하는 메소드에 사용                       |
| `@RequestMapping`  | HTTP 요청 경로 및 메소드 전반에 매핑, 커스텀 가능                 |
| `@RequestParam`    | URL 쿼리 파라미터를 메소드 인자로 받을 때 사용                   |
| `@PathVariable`    | URL 경로상의 변수를 메소드 인자로 받을 때 사용                   |
| `@ModelAttribute`  | HTTP 요청 파라미터를 객체로 자동 바인딩 할 때 사용                 |
| `@RequestBody`     | 요청 바디에 있는 JSON, XML 등을 객체로 매핑                        |
| `@ControllerAdvice`| 전역 예외 처리 클래스 지정, 컨트롤러 전반에 걸친 공통 예외 처리용          |
| `@ExceptionHandler`| 특정 예외 발생 시 처리할 메소드 지정                             |



---
### **7. 중간고사 당일 (9주차)**

---
### **8. 프로필, 게시판 수정하기 (10주차)**

- JPA Repository  
- 게시판(Board) 및 게시글(Article) 관리를 위해 JPA 기반 Repository 사용  
- 주요 메소드: CRUD, findAll, findById  
- Service 계층을 통해 Repository와 Controller 연동  

---
### **9.  게시판 검색과 페이징 (11주차)**

- 대용량 데이터 처리에서 검색 및 페이징은 필수 기능  
- 전통적 DB 쿼리 방식과 Elasticsearch 같은 검색엔진 비교  
- 스프링 부트 환경에서 JPA 및 페이징 처리

---

 **성능비교**

| 분류              | 속도           | 특징                          |
|-----------------|--------------|-----------------------------|
| HW (CPU)       | 빠름           | 1,000~10,000배 차이 가능         |
| SW (검색엔진)    | Elasticsearch, Solr | 대규모 데이터 최적화 처리                  |
| 캐시 솔루션       | Ehcache, Redis | 메모리 기반 빠른 접근                    |

---
### **10. 로그인과 로그아웃_1 (12주차)**

- 자바/스프링 기반 애플리케이션을 위한 보안 프레임워크  
- 인증(Authentication)과 인가(Authorization)를 필터 체인으로 처리  
- 아이디/비밀번호 기반 로그인, 권한(Role) 체크, 세션/쿠키 관리 등을 제공  
- 스프링 MVC와 자연스럽게 연동되며, 설정만으로 기본 로그인/로그아웃 페이지 제공  
- 보안 관심사(로그인, 접근제어)를 비즈니스 로직과 분리하여 관리 가능  

---
### **11. 로그인과 로그아웃_2 (13주차)**

- 로그인 성공 시 HttpSession에 userId, email 등을 저장하고, 브라우저에는 JSESSIONID 쿠키가 발급  
- 컨트롤러에서 session.getAttribute로 userId가 없으면 로그인 페이지로 리다이렉트하고, email 등을 꺼내 화면에 표시  
- 로그아웃 시 session.invalidate()로 세션을 무효화하고, JSESSIONID 쿠키의 값을 null로 만들고 만료시켜 브라우저 쿠키도 삭제  
- 보안 설정에서 세션 최대 동시 접속 수, 만료 URL, 세션 타임아웃, secure 쿠키 여부 등을 지정해 세션 보안을 강화   

---
### **12. 포트폴리오 완선 (14주차)**

- Thymeleaf index.html에 Bootstrap 폼 추가: 이름/이메일/제목/메시지 입력.
- FileController에서 MultipartFile 처리, upload 폴더에 이메일.txt로 저장 (BufferedWriter 사용).
- SecurityConfig.http.csrf().ignoringAntMatchers("/upload-email")로 CSRF 비활성화, IOException 예외 처리.
- RedirectAttributes로 성공/에러 플래시 메시지 전달, uploadend.html로 리다이렉트.
- application.properties에 spring.servlet.multipart.location=upload 설정.

---