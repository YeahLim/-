# 정수 삼각형

## :timer_clock: **Time**
.

## :pushpin: **Algorithm**

DP

## :round_pushpin: **Logic**
점화식 : `dp[i][j] = max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j]`



## :black_nib: **Review**
- 이 문제를 백준에서 풀 때는 더 빨리 풀었었는데, 프로그래머스에서 푸려니까, 뭔가 length처리가 헷갈린듯 하다.
  사실상 i행 만큼의 열의 개수가 존재하는 건데, 이 부분을 좀더 최적화 할 수 있을 것 같다.

