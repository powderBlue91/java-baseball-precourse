# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현 목록
  - 사용자 Input 
    - nextstep.utils.Console의 readLine()을 사용해서 입력 처리
    - 잘못된 입력값 예외 처리
    - 단위 테스트

  - 랜덤 숫자 생성기
    - nextstep.utils.Randoms의 pickNumberInRange()을 사용해서 랜덤값 3개 생성
    - 생성 할 때 서로의 수가 같지 않게 처리
    - 단위 테스트

  - 판정
    - 샤용자 입력과 랜덤 숫자를 비교해서 볼,스트라이크,낫싱 판정 처리
    - 단위 테스트

  - 게임 흐름
    - 게임 시작시 데이터 초기화 작업
    - 판정에 따른 게임 계속하기 or 종료하기 작업
