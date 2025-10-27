# **성결대학교 미디어소프트웨어 학과 자바웹프로그래밍(2)**

- 성결대학교 미디어소프트웨어 20220970 김동준

## **수업 활동**
### **1. 백엔드 프로그래밍, 스프링 프레임워크 (2주차)**

• 스프링 부트 다운로드, 자바 v21, JDK 설치  
• 새로운 스프링 부트 프로젝트 설정, 메인 부트 설정, resource/templates/index.html 생성  
• URI, URL, DispatcherServlet(프론트 컨트롤러), DemoController 생성  
• 컨트롤러 수정, URL 매핑 (index-hello1-hello2)

### **2. 웹 트렌드, 나만의 포트폴리오 제작 (3주차)**

• JAVA와 C# 비교, 스프링 부트 스택이란  
• 포트폴리오 템플릿을 사용하여 나만의 포트폴리오 제작  
• 일부 수정 및 '상세 소개(about detailed)' 링크 추가  

### **3. 데이터베이스 (4주차)**

• 프로필 수정(기술 경험 내용 수정)  
• 데이터베이스(MySQL) 다운로드 및 설치  
• 데이터베이스 연동  
• 프로젝트 폴더 구조 확인 및 패키지 세분화(MVC, Service, Repository)  
• SQL쿼리에 직접 INSERT를 통해서 testdb 작동 확인

### **4. 블로그, 게시글과 데이터베이스 연결 (5주차)**

• 블로그 페이지 제작  
• 블로그 게시판 매뉴 및 링크 등록    
• 블로그 게시판 작성, 등록 (스프링부트를 통해서 동작하기에 컨트롤러에 등록)  
• 엔티티 클래스, 리포지토리 클래스, 서비스 클래스 추가  
• 컨트롤러 게시판 요청, 응답 기능 추가  
• 'AddArticleRequest.java'를 통해 DTO(Data Transfer Object) 구현  
• 컨트롤러에 'favicon.ico' 에러 방지

### **5. ORM이란?, ORM 매핑과 엔티티 매니저 (6주차)**

• 게시글 수정과 삭제 기능 구현  
• 게시글 목록 아래 수정, 삭제 버튼 추가  
• 'article.html'생성 및 controller 맵핑 등록 (Get, Put, Delete) 
• 서비스 클래스 추가, 'Article.java'의 엔티티 글래스 수정  
• 애플리케이션 설정 추가 및 삭제 버튼 html 수정  
• 게시판 수정화면으로 직접 이동시에 에러 페이지 발생 (예외처리)

### **6. 중간고사 공지 (7주차)**

• 중간고사 공지 및 중간점검  
• 깃허브 메일 제출

### **7. 중간고사 당일 (8주차)**

• 중간고사

## 연습 문제 (모든 문제 풀이 완료)
### **2주차: URL 맵핑과 컨트롤러 추가하기 (完了)**

• 수업중 제작한 'hello.html'를 이용하여 'hello2.html'생성 및 'DemoController.java'에 url 맵핑

*DemoController.java에 맵핑 추가*
```
@GetMapping("/hello2")
public String hello2() {
    return "hello2";
}
```

### **3주차: 상세 페이지 수정하기 (完了)**

• 'about_detailed.html'의 되돌아가기 버튼을 누르면 창을 닫을지 물어보고, Y/N를 통해서 동작할 수 있도록 한다.

• 먼저 'main.js'를 수정한다
```
function confirmClose() {
    const closecall = window.confirm("되돌아가시겠습니까?");
    if (closecall) {
        window.close();
    }
}
```

• 다음 'about_detailed.html'의 되돌아가기 버튼 부분을 수정한다
```
<div class="col-lg-6 text-lg-end">
    <a class="btn btn-primary py-3 px-5" onclick="confirmClose()" href="/index">되돌아가기</a>
</div>
```

• 동작 확인

![confirmClose()](/src/main/resources/static/img/yesorno.png "confirmClose()")

### **4주차: 사용자 추가 및 출력하기 (完了)**

• VS CODE의 MySQL 확장을 사용하여 사용자를 DB에 직접 추가한다.

• 컨트롤러에 사용자 2, 3을 추가한다

*DemoController.java*
```
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
```
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

### **5주차: 페이지 리다이렉트 (完了)**

- 리다이렉트란 사용자가 처음 요청한 URL이 아닌, 다른 URL로 보내는 것

• 기존 @BlogRestController방식을 BlogController 방식으로 수정

• BlogController.java에 맵핑 추가 (리턴 타입: String)
```
@PostMapping("/api/articles")
public String addArticle(@ModelAttribute AddArticleRequest request) {
    Article saveArticle= blogService.save(request);
    ResponseEntity.status(HttpStatus.CREATED).body(saveArticle);
    return "redirect:/article_list"; 
}
```

### **6주차: 예외처리 (完了)**

• 수업중 진행했던 'article_error.html'을 재사용하여 'add_error.html'생성

• 'BlogErrorHandler.java' 생성
```
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