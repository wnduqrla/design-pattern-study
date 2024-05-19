# 옵저버 패턴 (observe-pattern)
한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의합니다.

![observe-pattern-diagram](https://github.com/juyeop03/design-pattern-study/assets/49600974/e6c6f724-6cad-4fba-99e6-1a7efe2691c5)

## 장점
느슨한 결합 구조로 인해 신규 구독자가 생기더라도 주제는 변경이 없습니다.
