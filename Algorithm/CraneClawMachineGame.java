import java.util.*;
class CraneClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack <Integer> basket = new Stack<Integer>();
        for (int i : moves) {
            int move = i-1;
            if (board[board.length-1][move] != 0) {// 해당 줄의 가장 밑에 인형이 있으면 탐색
                for (int j=0;j<board.length;j++) { // 맨 윗 줄부터 탐색
                    if (board[j][move] == 0) // 인형이 없으면 지나감
                        continue;
                    else {
                        int doll = board[j][move];
                        board[j][move] = 0;
                        if (basket.isEmpty()) { // 바구니에 인형이 없으면 담기
                            basket.push(doll);
                        }
                        else {
                            if (basket.peek() == doll) { // 바구니의 가장 위의 인형이 뽑은 인형과 같으면 삭제
                                answer += 2;
                                basket.pop();
                            }
                            else { // 아니면 바구니에 담기
                                basket.push(doll);
                            }
                        }
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
