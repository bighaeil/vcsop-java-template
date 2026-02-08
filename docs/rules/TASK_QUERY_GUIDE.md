# 작업 질의 가이드 (Task Query Guide)

AI가 코드 작업을 요청받을 때 사용하는 JSON 템플릿 형식과 규칙을 정의합니다.

## 템플릿 형식

```json
{
  "jira": "PROJ-123 | none",
  "layer": "infrastructure/in | application | domain",
  "summary": "사용자 조회 API 구현",
  "tech": "rest | jpa | rabbitmq",
  "api_path": "GET /api/users/{id}",
  "parameter": "id: Long",
  "return": "UserResponse",
  "errorCases": ["404: 사용자 없음"],
  "steps": [
    "1. Controller 생성",
    "2. UseCase 구현",
    "3. Port 정의"
  ]
}
```

## AI 행동 규칙

템플릿 없이 코드 요청 시:
> "템플릿을 활용한 질의가 아닙니다. 정말로 그냥 진행할까요?"

## 작업 결과 기록

`docs/changelog/` 폴더에 Trace ID와 함께 기록

---
**마지막 업데이트**: 2026년 2월
