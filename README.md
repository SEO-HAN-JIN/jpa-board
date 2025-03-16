# 게시판 프로젝트 (Board Application)

## 프로젝트 설명
이 프로젝트는 Spring Boot와 JPA, QueryDSL을 활용하여 게시판 API를 구축하는 예제입니다. 모든 기능은 RESTful API 형태로 제공됩니다.

## 주요기능
- **회원 CRUD**: 회원 가입, 조회, 수정, 삭제
- **게시글 CRUD**: 게시글 작성, 조회, 수정, 삭제
- **게시플 페이징**: 게시글 목록을 페이지네이션으로 제공
- **게시글 검색**: QueryDSL을 활용한 동적 검색 기능
- **게시글 좋아요**: 게시글에 좋아요를 추가 및 취소하는 기능
- **댓글/대댓글 기능**: 게시글에 댓글 및 대댓글을 달 수 있는 기능
- **태그 기능**: 게시글에 여러 태그를 추가할 수 있는 기능
- **API 형식**: RESTful API (JSON 형식)

## 기술 스택
- **Backend**: SpringBoot, Spring Data JPA, QueryDSL
- **Database**: H2
- **Build Tool**: Gradle
- **Others**: Lombok
