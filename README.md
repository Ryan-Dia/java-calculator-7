# java-calculator-precourse

## 🚀기능 목록

- [] 형식에 맞는 시작 문구 출력
- []사용자에게 덧셈할 문자열 입력 받기
    - [] 빈문자열은 0을 바로 반환
    - [] 유효성 검사 (소수 고려)
        - (예외) 문자열 앞부분에 커스텀 구분자가 있는지 확인
        - (예외) 커스텀 구분자가 올바르게 있는지 확인
        - (예외) 커스텀 구분자 사이에 하나의 문자만 있는지 확인
        - (예외) 연속된 구분자공백이 있을 경우 예외
- [] 구분자에 맞게 쪼개기
- [] 숫자 유효성 검사
    - (예외) 음수가 포함된 경우 예외
    - (예외) 0은 양수가 아니므로, 예외
    - (예외) 숫자가 아닌 문자 포함된 경우
    - (예외) 구분자 사이의 소수가 연속으로 소수점이 있다면 예외
- [] 구분자에 맞게 문자를 나누고 숫자 끼리 더해주기
- [] 결과값 형식에 맞게 출력

## ❗️사전 체크

### 과제 진행 요구 사항

- [x] 기능을 구현하기 전 README.md에 구현할 기능 목록을 정리
- [x] AngularJS Git Commit Message Conventions을 참고해 커밋 메시지를 작성

### 기능 요구 사항

- [x] 입력 : 구분자와 양수로 구성된 문자열 (소수 가능)
- [x] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

### 프로그래밍 요구 사항

- [x] Java 21로 실행되는지 확인
- [x] build.gradle 파일은 변경할 수 없으며, 제공된 라이브러리 이외의 외부 라이브러리는 사용하지 않는다.
- [x] 프로그램 종료 시 System.exit()를 호출하지 않는다.
- [x] 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.
- [x] 자바 코드 컨벤션을 지키면서 프로그래밍한다. (기본적으로 Java Style Guide를 원칙으로 한다.)
- [x] camp.nextstep.edu.missionutils에서 제공하는 Console API를 사용하여 구현해야 한다.
    - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.