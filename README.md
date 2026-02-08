# VCSOP Java Template

**Vibe Coding Standard Operating Procedure (VCSOP)** - AI와 협업하는 백엔드 개발 표준 프로세스

## 📋 개요

이 템플릿은 MCP(Model Context Protocol) 기반 바이브 코딩 방식으로 Java/Spring Boot 프로젝트를 개발할 때 사용하는 표준 작업 절차와 문서 구조를 제공합니다.

### 주요 특징

- ✅ **헥사고날 아키텍처** 기반 프로젝트 구조
- ✅ **MCP 중앙 집중형 서버** 연동 (Jira, Confluence, GitLab, MySQL, Redis)
- ✅ **8단계 표준 작업 절차** (VCSOP)
- ✅ **문서 중심 개발** - 모든 작업이 추적 가능
- ✅ **팀 협업 최적화** - 일관된 컨벤션 및 자동화

---

## 🚀 빠른 시작

### 1. Repository Clone

```bash
git clone https://github.com/YOUR_USERNAME/vcsop-java-template.git
cd vcsop-java-template
```

### 2. MCP 서버 설정

`mcp-server-config.json` 파일을 생성하고 MCP 서버 정보를 입력합니다:

```json
{
  "mcpServers": {
    "vcsop-mcp": {
      "url": "http://your-mcp-server:3000/sse",
      "description": "VCSOP MCP Server - Jira, Confluence, GitLab, MySQL, Redis"
    }
  }
}
```

### 3. 프로젝트 실행 (Hello World)

```bash
# Gradle Wrapper 권한 설정
chmod +x gradlew

# 로컬 환경 실행
./gradlew bootRun --args='--spring.profiles.active=local'
```

서버 실행 후 http://localhost:9500/swagger-ui.html 접속하여 API 확인

---

## 📁 프로젝트 구조

```
vcsop-java-template/
├── CLAUDE.md                       # Claude Code 진입점
├── README.md                       # 프로젝트 소개
├── mcp-server-config.json          # MCP 서버 설정 예시
│
├── docs/                           # 문서 루트
│   ├── rules/                      # AI 행동 규칙
│   │   ├── TASK_QUERY_GUIDE.md
│   │   ├── CODE_CONVENTIONS.md
│   │   ├── DOCUMENTATION.md
│   │   └── PROJECT_SETUP.md
│   │
│   ├── requirements/               # 요구사항 정의
│   │   ├── features/               # PRD 문서
│   │   └── queries/                # JSON 질의 템플릿
│   │
│   ├── templates/                  # 표준 템플릿
│   │   ├── PR_TEMPLATE.md
│   │   ├── JIRA_TEMPLATE.md
│   │   └── API_TEMPLATE.md
│   │
│   ├── adr/                        # Architecture Decision Records
│   ├── changelog/                  # 작업 변경 이력
│   ├── design/                     # 설계 문서 (Confluence 동기화)
│   └── backlog/                    # 백로그 & TODO
│
├── src/main/java/com/example/vcsop/
│   ├── domain/                     # 도메인 레이어
│   ├── application/                # 애플리케이션 레이어
│   ├── infrastructure/             # 인프라스트럭처 레이어
│   ├── shared/                     # 공유 레이어
│   └── config/                     # 설정 레이어
│
├── build.gradle
├── settings.gradle
└── gradlew
```

---

## 🔄 VCSOP 8단계 워크플로우

### Phase 1: Discovery (발견) - 3단계

**1. 요구사항 입체 분석 (Analysis)**
- 입력: Figma, Confluence, Jira
- 출력: `docs/requirements/features/*.md` (PRD)

**2. 실행 계획 수립 (Planning)**
- 입력: PRD 문서
- 출력: `docs/requirements/queries/*.json` (JSON 질의 템플릿)

**3. 일감 등록 및 매핑 (Tasking)**
- MCP Jira 도구로 티켓 생성
- Jira 번호를 JSON 템플릿에 기록

### Phase 2: Development (개발) - 2단계

**4. 개발 환경 준비 (Setup)**
- Git 브랜치 생성 (`feature/{jira-번호}`)
- 규칙 문서 로딩 (`docs/rules/CODE_CONVENTIONS.md`)

**5. 기능 구현 (Implementation)**
- JSON 질의 템플릿 기반 코딩
- 단위 테스트 작성

### Phase 3: Verification (검증) - 2단계

**6. 로컬 검증 (Local Validation)**
- 빌드/린트 체크
- 테스트 실행
- 로컬 서버 구동

**7. 코드 리뷰 (Code Review)**
- PR 생성 (템플릿: `docs/templates/PR_TEMPLATE.md`)
- 리뷰어 피드백 수렴 및 반영

### Phase 4: Closure (완료) - 1단계

**8. 마무리 및 동기화 (Wrap-up)**
- `docs/changelog/` 작업 이력 기록
- `docs/design/` 문서 업데이트 (필요시)
- Confluence 동기화
- Jira 티켓 완료 처리

---

## 📝 사용 가이드

### 1. 새로운 기능 개발 시작

```bash
# 1단계: PRD 문서 작성
vi docs/requirements/features/NEW_FEATURE.md

# 2단계: JSON 질의 템플릿 작성
vi docs/requirements/queries/NEW_FEATURE.json

# 3단계: Jira 티켓 생성 (MCP 도구 사용)
# 4단계: 브랜치 생성
git checkout -b feature/PROJ-123

# 5단계: 코딩
# 6단계: 테스트
./gradlew test

# 7단계: PR 생성
# 8단계: 작업 이력 기록
vi docs/changelog/DOMAIN.md
```

### 2. AI에게 작업 요청 시

`docs/requirements/queries/` 하위에 JSON 템플릿을 작성합니다:

```json
{
  "jira": "PROJ-123",
  "layer": "infrastructure/in",
  "summary": "사용자 조회 API 구현",
  "tech": "rest",
  "api_path": "GET /api/users/{id}",
  "parameter": "id: Long",
  "return": "UserResponse",
  "errorCases": ["404: 사용자 없음"],
  "steps": [
    "1. Controller 생성",
    "2. UseCase 구현",
    "3. Port 정의",
    "4. Adaptor 구현"
  ]
}
```

AI에게 이 템플릿을 제공하고 `docs/rules/TASK_QUERY_GUIDE.md` 규칙에 따라 작업을 요청합니다.

---

## 🛠 기술 스택

- **Java**: 21
- **Spring Boot**: 3.3.0
- **Build Tool**: Gradle
- **Architecture**: Hexagonal (Ports & Adapters)
- **Database**: MySQL (JPA)
- **API Documentation**: Swagger/OpenAPI

---

## 📚 주요 문서

### AI 행동 규칙
- [CLAUDE.md](CLAUDE.md) - AI 룰셋 메인 인덱스
- [TASK_QUERY_GUIDE.md](docs/rules/TASK_QUERY_GUIDE.md) - 작업 요청 템플릿
- [CODE_CONVENTIONS.md](docs/rules/CODE_CONVENTIONS.md) - 코딩 컨벤션
- [DOCUMENTATION.md](docs/rules/DOCUMENTATION.md) - 문서화 규칙

### 설계 문서
- [ARCHITECTURE.md](docs/design/ARCHITECTURE.md) - 아키텍처 개요
- [DATABASE.md](docs/design/DATABASE.md) - DB 스키마
- [SEQUENCES.md](docs/design/SEQUENCES.md) - 시퀀스 다이어그램

---

## 🤝 기여 가이드

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Follow VCSOP 8-step workflow
4. Commit your changes (`git commit -m 'PROJ-123: Add amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a Pull Request (use `docs/templates/PR_TEMPLATE.md`)

---

## 📄 라이선스

MIT License - 자유롭게 사용, 수정, 배포 가능합니다.

---

## 🔗 관련 링크

- **블로그 포스트**: (추후 추가)
- **MCP 서버 구축 가이드**: (추후 추가)
- **실전 사례 연구**: (추후 추가)

---

## 📮 문의

- GitHub Issues: [vcsop-java-template/issues](https://github.com/YOUR_USERNAME/vcsop-java-template/issues)
- 블로그: (추후 추가)

---

**Made with ❤️ for AI-powered Development**
