# TeamMakeAppMSA(이름 : 팀메이크(가칭)

- 개발 프로젝트, 게임 팀원등 각종 팀원들을 가볍고 쉽게 만들수 있는 애플리케이션입니다.

- 게시판에서 구인글을 올리고 신청이 완료되면 팀 채팅방으로 이동해서 소통하는 플랫폼입니다.
- 팀메이킹 사이트를 구현해본 MSA기반 MVP 프로젝트입니다.
- 이 프로젝트는 백엔드 부분을 주력으로 하며 프론트부분은 최소기능으로 구현예쩡입니다.
- Msa간 동기 통신 Grpc로, 비동기 통신은 Kafka로 구현 예정입니다

## Swagger, Graphiql 📝

- 구현 예정입니다

- [Eureka Discovery](https://clientbediscovery.gongik.shop)
- [Swagger Rest Api(Only Auth service)](https://clientbe.gongik.shop/swagger-ui/index.html)
- [Graphiql Api](https://clientbe.gongik.shop/graphiql)

## 제작 기간 📅 && 참여 인원 🧑‍🤝‍🧑

- 2025.03.04~
- 취업을 위한 개인 프로젝트입니다.

## 주요 기능 ✨

#### 밑에 api별로 상세 설명이 있으니 여기선 큰 틀에서 설명하겠습니다.

1. 회원가입후 상품 검색, 상품에 대한 정보와 후기와 별점 공유
2. 커뮤니티 게시판을를 통해 팀원모집, 게시판의 대댓글 기능 까지 가능
3. 본인글 혹은 작성한 댓글, 대댓글에 알림 기능 (Graphql subscription)
4. 신고 기능 (사용자신고, 글신고 등등 다양)

## 시스템 구성도 🗺️

예정

## 기술 스택 🧑‍💻

#### Back-End

- Java 17
- Spring Boot 3.2.5
- Spring Cloud
- Spring Graphql
- Spring Security (jwt)
- Spring Batch
- Spring Data JPA
- Spring Data Redis
- Eureka Discovery
- Eureka Client
- Grpc
- Websocket

#### Data Storage & Processing

- PostgreSQL
- Redis
- Kafka

#### Distributed Tracing

- ElasticSearch
- Logstash
- Kibana

#### Monitoring

- Prometheus
- Grafana

### Deployment

- Docker compose
- Jenkins
