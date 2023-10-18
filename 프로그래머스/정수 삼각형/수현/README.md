# 정수 삼각형

## :timer_clock: **time**

15분 19초

## :pushpin: **Algorithm**

DP

## :round_pushpin: **Logic**

1. 알고리즘

   주어진 삼각형을 직각 삼각형으로 변형한뒤 점화식을 생성하면 다음과 같다.
   
    ```
    점화식
    (n번째의 최대값) = max((n-1번째의 현재 열-1의 최대값),(n-1번째의 현재 열 최대값)) + (n번째의 값)
    ```
2. 코드 설명
   

## :black_nib: **Review**

1. input값이 정사각형의 배열이 아닌 삼각형 형태로 배열을 주기 때문에 length 변수가 아닌 triangle[i].length로도 가능
