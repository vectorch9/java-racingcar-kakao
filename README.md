# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## Ground Rule
- 교대는 큼직한 기능 하나
  - 너무 자주 바꾸니 몰입 떨어짐
- 테스트는 given-when-then 패턴을 사용한다.

## 프로그래밍 요구사항
- 자바 컨벤션
- 인덴트 1칸
- 메서드 길이 10
- else 사용 금지
- UI를 제외한 모든 로직에 단위 테스트

## 기능 요구사항
- 자동차는 n대가 존재한다.
- 각 자동차는 이름을 가진다.
- 이름은 사용자가 쉼표로 구분하여 입력한다.
- 전진하는 차를 출력할 때 이름이 함께 출력된다.
- 사용자는 몇 번 이동할지 입력한다.
- 자동차는 랜덤 0~9에서 4 이상이면 전진하고, 3 이하면 멈춘다.
- 완료 후 누가 우승했는 지 알려주며, 한 명 이상일 수 있다.

### TODO LIST
- 여러 개의 자동차를 한번에 관리할 수 있어야한다. Race
  - 각 자동차를 출력한다.
  - 승리자를 반환한다.

### DONE
- 자동차가 이름을 가질 수 있어야함. 시작 위치는 0이어야함.
- 출력할 수 있어야함
- 자동차가 전진할 수 있어야함
- 여러 개의 자동차를 한번에 관리할 수 있어야한다. Race
  - 각 자동차의 이름을 지정한다.
  - 각 자동차를 전진시킨다.
