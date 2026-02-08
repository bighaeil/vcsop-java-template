# VCSOP AI Ruleset

이 문서는 AI가 VCSOP(Vibe Coding Standard Operating Procedure) 프로젝트를 이해하고 일관된 방식으로 작업할 수 있도록 하는 룰셋입니다.

**중요**: 이 룰셋은 관리 편의를 위해 여러 파일로 분리되어 있습니다. 각 파일은 특정 목적에 맞게 구성되어 있습니다.

---

## 📋 목차

이 룰셋은 다음 4개의 파일로 구성되어 있습니다:

1. **[AI 질의 템플릿](docs/rules/TASK_QUERY_GUIDE.md)** - AI가 코드 작업을 요청받을 때 사용하는 질의 템플릿과 규칙
2. **[프로젝트 초기 셋팅](docs/rules/PROJECT_SETUP.md)** - 프로젝트 초기 셋팅 가이드
3. **[프로젝트 구조 및 코드 컨벤션](docs/rules/CODE_CONVENTIONS.md)** - AI가 코딩을 할 때 통일된 코딩 컨벤션 및 구조를 지킬 수 있도록 하는 규칙
4. **[문서화 규칙](docs/rules/DOCUMENTATION.md)** - AI가 작업을 실행할 때 문서화가 필요한 경우 규격에 맞게 문서화할 수 있도록 하는 규칙

---

## 파일별 상세 내용

### 1. AI 질의 템플릿 (`docs/rules/TASK_QUERY_GUIDE.md`)

AI가 코드 추가 및 수정 작업을 요청받을 때 사용하는 JSON 템플릿 형식과 규칙을 정의합니다.

**주요 내용:**
- 템플릿 형식 및 필드 설명
- 사용 예시 (REST API, Domain Model, UseCase 등)
- AI 행동 규칙
- 작업 결과 기록 규칙 (`docs/changelog/` 폴더)

**사용 시점:**
- 코드 추가 또는 수정 작업을 요청할 때
- AI가 템플릿 형식을 확인하고 작업을 수행할 때

---

### 2. 프로젝트 초기 셋팅 (`docs/rules/PROJECT_SETUP.md`)

프로젝트가 전혀 없는 상태에서도 AI가 Spring Boot 기반 hello world 서버를 만들 수 있도록 하는 초기 셋팅 가이드입니다.

**주요 내용:**
- 프로젝트 개요 및 정보
- 기술 스택 및 버전
- 환경별 설정 (로컬, 개발, QA, 스테이징, 운영)
- 애플리케이션 설정 파일 (`application.yml`)
- 의존성 관리 (`build.gradle`)
- Gradle 빌드 설정
- 빌드 및 실행 방법
- 개발 환경 설정

**사용 시점:**
- 새로운 프로젝트를 시작할 때
- 프로젝트 초기 셋팅이 필요할 때
- 빌드 및 실행 방법을 확인할 때

---

### 3. 프로젝트 구조 및 코드 컨벤션 (`docs/rules/CODE_CONVENTIONS.md`)

AI가 코딩을 할 때 통일된 코딩 컨벤션 및 구조를 지킬 수 있도록 하는 규칙입니다.

**주요 내용:**
- 제1원칙: 팀 컨벤션 (도메인 모델 패턴, DDD, 헥사고날 아키텍처)
- 네이밍 규칙 (약어 금지, 명확한 메서드명)
- 타입 규칙 (DTO는 Record, Optional 사용 규칙, null 안전성)
- 상수 관리 규칙 (Enum 사용)
- 아키텍처 패턴 (헥사고날 아키텍처)
- 프로젝트 구조 (디렉토리 구조, 레이어별 역할)
- 의존성 방향 규칙
- 코드 작성 규칙 (Domain Model, Domain Service, Port, UseCase, Controller, Adaptor, Entity, Repository)
- API 버전 관리
- 아키텍처 테스트
- 주의사항

**사용 시점:**
- 코드를 작성하거나 수정할 때
- 새로운 클래스나 인터페이스를 생성할 때
- 코딩 컨벤션을 확인할 때
- 아키텍처 규칙을 확인할 때

---

### 4. 문서화 규칙 (`docs/rules/DOCUMENTATION.md`)

AI가 작업을 실행할 때 문서화가 필요한 경우 규격에 맞게 문서화할 수 있도록 하는 규칙입니다.

**주요 내용:**
- 문서 구조 (`docs/design/` 폴더)
- Confluence 동기화 규칙
- 문서와 Confluence 페이지 매핑
- 자동 동기화 규칙 (아키텍처 변경, 데이터베이스 모델링 변경 등)
- Confluence 동기화 방법 (MCP 도구 사용)
- 문서 작성 규칙

**사용 시점:**
- 아키텍처나 비즈니스 로직을 변경할 때
- 새로운 기능을 추가할 때
- 문서를 업데이트해야 할 때
- Confluence 페이지를 동기화해야 할 때

---

## 사용 가이드

### AI가 작업을 시작할 때

1. **코드 작업 요청 시**: `docs/rules/TASK_QUERY_GUIDE.md` 참조
2. **프로젝트 셋팅 필요 시**: `docs/rules/PROJECT_SETUP.md` 참조
3. **코드 작성 시**: `docs/rules/CODE_CONVENTIONS.md` 참조
4. **문서화 필요 시**: `docs/rules/DOCUMENTATION.md` 참조

### 파일 구조

```
vcsop-java-template/
├── CLAUDE.md                    # 메인 인덱스 파일 (이 파일)
└── docs/
    └── rules/
        ├── TASK_QUERY_GUIDE.md     # AI 질의 템플릿
        ├── PROJECT_SETUP.md         # 프로젝트 초기 셋팅
        ├── CODE_CONVENTIONS.md      # 프로젝트 구조 및 코드 컨벤션
        └── DOCUMENTATION.md         # 문서화 규칙
```

---

## VCSOP 8단계 워크플로우

### Phase 1: Discovery (발견) - 3단계
1. **요구사항 입체 분석** - Figma, Confluence, Jira → PRD 문서
2. **실행 계획 수립** - PRD → JSON 질의 템플릿
3. **일감 등록 및 매핑** - Jira 티켓 생성 및 매핑

### Phase 2: Development (개발) - 2단계
4. **개발 환경 준비** - Git 브랜치 생성, 규칙 로딩
5. **기능 구현** - 코딩 및 테스트 작성

### Phase 3: Verification (검증) - 2단계
6. **로컬 검증** - 빌드, 테스트, 로컬 실행
7. **코드 리뷰** - PR 생성 및 피드백 반영

### Phase 4: Closure (완료) - 1단계
8. **마무리 및 동기화** - 작업 이력 기록, 문서 업데이트, Confluence 동기화

---

## 참고 자료

- **프로젝트 문서**: `README.md`
- **설계 문서**: `docs/design/`
- **Spring Boot 문서**: https://spring.io/projects/spring-boot
- **JPA 문서**: https://spring.io/projects/spring-data-jpa
- **헥사고날 아키텍처**: https://alistair.cockburn.us/hexagonal-architecture/

---

**마지막 업데이트**: 2026년 2월

**이 룰셋은 프로젝트의 일관성을 유지하고 AI가 올바르게 작업할 수 있도록 합니다.**
