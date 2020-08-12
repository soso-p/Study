# Study
Post what I have studied.
___
Algorithm
-
- 백준 10809번 FindAlphabet

- 백준 2675번 RepeatingCharacters

- 백준 1152번 단어의 개수
  > 문장 맨 앞, 뒤에도 공백이 들어갈 수 있다. 따라서 공백만 입력될 수도 있다.
공백만 입력됬을 때도 array.length가 1이 나오므로 그 점을 유의해야된다.

- 백준 1157번 단어 공부
  > Scanner를 close() 해주지 않아 런타임오류가 발생했었다.

- 백준 2908번 상수
  > StringBuffer를 이용해서 문자열을 거꾸로 바꿨다.

- 백준 5622번 다이얼

- 백준 1316번 그룹 문자 체커

- 백준 2941번 크로아티아 알파벳
  > substring()을 사용할 때 String의 index를 넘어가서 런타임 오류가 발생했다. if(String.length()>1)로 변경해서 해결했다.

- 백준 1712번 손익분기점

- 백준 2839번 설탕 배달
  > recursive하게 하니 시간 제한에 걸려서 실패했다. 반복으로 다시 짜서 해결했다.

- 백준 2292번 벌집
  > 원의 round가 같으면 도달하는 길이가 다 같은 문제였다.
  
- 백준 1193번 분수찾기

- 백준 10250번 ACM 호텔
  > 방번호가 한 자리 수 일때만 사이에 0이 들어가지만 두 자리 수 일때는 0이 들어가지 않는 데 0을 출력해서 틀렸었다. String.format을 이용해서 총 두 자리 중 빈자리는 0으로 채우게 했다.

- 백준 2869번 달팽이는 올라가고 싶다

- 백준 2775번 부녀회장이 될테야

- 백준 1011번 Fly me to the Alpha Centauri
  > 규칙을 찾지못해서 백준의 게시판에서 관련 팁을 봤지만 그래도 이해하지 못했다. 인터넷에 찾아보니 표를 그려서 전체적으로 보고 규칙을 찾아 간단하게 문제를 푸는 것을 발견했다. 그 글을 통해 풀었다. 출처: https://st-lab.tistory.com/79
  
- 백준 1978번 소수 찾기
  > 2일 때 소수가 아닌 수로 되어서 틀렸다. if 문으로 2를 따로 처리해줬다.
  
- 백준 2581번 소수
  > 2일 때 소수가 아닌 수로 되어서 오류가 났었다. if 문으로 2를 따로 처리해줬다.

- 백준 1929번 소수 구하기
  > 에라토스체네스의 체를 이용해서 푸는 문제였다.

- 백준 4948번 베르트랑 공준
  > 에라토스체네스의 체를 응용해서 풀었다.

- 백준 9020번 골드바흐의 추측
  > 배열의 index가 넘어간 범위를 접근해서 런타임 에러가 났다. index가 넘어간 원인은 에라토스테네스의 체 연산을 하는 과정에서 오류가 있었다. 해당 오류를 고치니 해결됬다.

- 백준 1085번 직사각형에서 탈출

- 백준 3009번 네번째 점

- 백준 4153번 직각삼각형

- 백준 3053 택시 기하학
  > 유클리드 기하학과 택시 기하학을 이용하는 문제였다.
  
- 백준 1002번 터렛
  > 두 원의 교점의 개수를 구하는 문제였다. 자바에서는 double형의 값을 비교할 때는 근사치로 비교해서 ex) 0.1+0.2=0.3 할 경우 같지 않다는 결과가 나온다고 한다. 그걸 몰라서 처음엔 계속 틀렸다. double형이 나오지 않도록 비교하는 값들은 제곱해서 int 형으로 비교하였다.
  
- 백준 10872번 팩토리얼

- 백준 10870번 피보나치 수 5

- 백준 2447번 별 찍기 - 10
  > char 배열에 하나하나 별을 넣고 StringBuilder로 합쳐서 출력했다.

- 백준 11729 하노이 탑 이동 순서

- 백준 2231번 분해합

- 백준 2798번 
_______
Data Structure
--
- 스택 자바 구현
- 선형 큐 자바 구현
- 원형 큐 자바 
