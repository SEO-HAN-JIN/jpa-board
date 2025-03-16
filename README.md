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

## 프로젝트 진행 중 학습한 내용
### 1. 기본생성자 (`@NoArgsConstructor`)
- JPA 엔티티 클래스는 기본 생성자가 필요하며, 외부에서 직접 호출하지 못하도록 `protected`로 막는게 적절하다.
- Lombok의 `@NoArgsConstructor(access=AccessLevel.PROTECTED)`를 사용하면 강제할 수 있다.

### 2. JPA Auditing(공통 필드 자동화)
- `@MappedSuperclass`: 공통 필드를 가지는 상위 엔티티 설정
- `@EntityListeners(AuditingEntityListener.class)`, `@EnableJpaAuditing`: JPA Auditing 활성화
  - `@CreatedDate`, `@LastModifiedDate`, `@CreatedBy`, `@LastModifiedBy` 같은 자동 필드 관리 기능 사용 가능
- `@CreatedBy`, `@LastModifiedBy`는 `AuditorAware`가 제공한 값이 필드에 자동적으로 할당된다.

