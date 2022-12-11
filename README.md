# 자판기

## 프로젝트 소개
반환되는 동전이 최소한이 되는 자판기

## 기능 목록
1. 자판기가 보유한 동전 세팅
   - [x] 보유하고 있는 금액을 입력받음
   - [x] 무작위로 동전 생성
   - [x] 보유한 동전 출력
2. 상품 세팅
   - [x] 상품명, 가격, 수량 입력받음
   - [x] 상품 저장
3. 돈 투입
   - [] 투입 금액 입력받음
   - [] 사용자의 금액으로 저장
4. 상품 구매
   - [] 구매할 상품명 입력받음
   - [] 투입 금액으로 상품을 살 수 있으면 구매
     - [] 사용자의 금액에서 상품 금액만큼 뺌
     - [] 구매한 상품의 개수 하나 줄어듦
5. 잔돈 반환
   - [] 남은 금액이 상품의 최저 가격보다 적을 때
   - [] 모든 상품이 소진되었을 때
   - [] 보유한 최소 개수의 동전으로 돌려줌
   - [] 잔돈을 반환하지 못할 경우, 잔돈으로 반환할 수 있는 금액만 반환

- [] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고,"[ERROR]"로 시작하는 에러 메시지를 출력 후 해당 부분부터 다시 입력을 받음

## 고려사항