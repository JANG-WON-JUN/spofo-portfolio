# SPOFO란?

SPOFO란 Stock Portfolio의 줄임말로 주식 포트폴리오를 제공하는 서비스입니다.

> SPOFO의 포트폴리오 서버는 인증을 담당하는 인증서버 및 주식 정보를 제공하는 주식 서버와 REST API를 사용하여 통신합니다.

<br>

# Server Architecture

## Architecture Diagram

<br>

## Hexagonal Architecture

본 서버는 헥사고날 아키텍처를 사용하여 도메인이 사용하는 외부 의존성과의 결합도를 줄이고, 빠르게 실행되는 테스트 코드를 작성하였습니다.

> 2023년 10월 기준, 3개의 도메인에 대해 총 140여 개의 단위 및 통합 테스트를 작성하였습니다. <br>
> 모든 테스트는 약 1.5초에 완료되며 빠르게 실행되는 테스트를 통해 더욱 더 견고한 프로그램을 만들어가고 있습니다.

<br>

# 사용 기술

- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- Spring Rest Docs

<br>

# 배포 환경

- Gradle
- Github Action
- Docker
- EC2
