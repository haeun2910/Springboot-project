# 스택
- Spring Boot 3.3.2
- Spring Boot Data JPA
- SQLite
- Thymeleaf
# 실행
1. 본 Repository를 clone 받는다.
2. Intellij IDEA를 이용해 clone 받은 폴더를 연다.
3. CommunityApplication.java의 main을 실행한다.
SQLite를 사용하며, 테스트 데이터를 넣어주기 위한 data.sql가 첨부되어 있기 때문에 실행하면 바로 기능을 확인할 수 있다.

# 림크 확인 방법
- 게시판 목록 보기: /boards/
- 게시글 목록 보기: /boards/{boardId}/
- 게시글 보기: /boards/{boardId}/articles/{articleId}/read
- 게시글 수정: /boards/{boardId}/articles/{articleId}/update
- 게시글 삭제: /boards/{boardId}/articles/{articleId}/delete
- 게시글 작성: /boards/articles/create
- 댓글 작성: /boards/{boardId}/articles/{articleId}/comments/
- 댓글 삭제: /boards/{boardId}/articles/{articleId}/comments/{commentId}/delete/

# 프로젝트 진행 시 발생한 어려움
- 데이터베이스 모델링: 게시판, 게시글, 댓글 간의 관계를 설정하는 과정에서 데이터베이스 모델링이 복잡해질 수 있습니다.
- 비밀번호 검증: 게시글과 댓글 수정 및 삭제 시 비밀번호를 확인하는 과정에서 보안적으로 안전한 방법을 구현하는 데 어려움이 있을 수 있습니다.
- 게시판, 게시글, 댓글의 CRUD 기능을 구현하는 과정에서 getmapping postmapping and html의 action 좀 해갈렸음
