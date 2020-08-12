import java.util.*;
public class CircularQueue {
  private int front;
  private int rear;
  private int MAX_QUEUE_SIZE;
  private int data[];
  
  public CircularQueue(int size) { // 큐 생성
    MAX_QUEUE_SIZE = size;
    data = new int[MAX_QUEUE_SIZE];
  }
  
  private void error(String message) { // 에러 메시지 출력
    System.out.println(message);
  }
  
  public void initQueue() { // 큐 초기화
    rear = 0;
    front = 0;
  }
  
  public void queuePrint() { // 큐 내부 출력
    System.out.println("QUEUE(front="+front+" rear="+rear+") = ");
    if (!isEmpty()) {
      int i=front;
      do {
        i = (i+1)%(MAX_QUEUE_SIZE);
        System.out.println(data[i]+" | ");
        if (i==rear)
          break;
      } while (i!=front);
    }
    System.out.println();
  }
  
  public boolean isFull() { // 포화상태 확인
    if ((this.rear+1)%MAX_QUEUE_SIZE == this.front)
      return true;
    else
      return false;
  }
  
  public boolean isEmpty() { // 공백상태 확인
    if (this.front == this.rear)
      return true;
    else
      return false;
  }
  
  public void enqueue(int item) { // 큐 삽입
    if (isFull()) {
      error("큐가 포화상태입니다.");
      return;
    }
    rear = (rear+1)%MAX_QUEUE_SIZE;
    data[rear] = item;
  }
  
  public int dequeue() { // 큐 삭제
    if (isEmpty()) {
      error("큐가 공백상태입니다.");
      return -1;
    }
    front = (front+1)%MAX_QUEUE_SIZE;
    return data[front];
  }
  
  public int peek() { // 큐 
    if (isEmpty()) {
      error("큐가 공백상태입니다");
    }
    return data[(front+1)%MAX_QUEUE_SIZE];
  }
  
  public static void main(String args[]) {
    int item = 0;
    Scanner sc = new Scanner(System.in);
    CircularQueue circularQueue = new CircularQueue(5);
    
    circularQueue.initQueue();
    
    System.out.println("--데이터 추가 단계--");
    while (!circularQueue.isFull()) {
      System.out.print("정수를 입력하시오: ");
      item = sc.nextInt();
      circularQueue.enqueue(item);
      queuePrint();
    }
    System.out.println("큐는 포화상태입니다.\n");
    sc.close();
    
    System.out.println("--데이터 삭제 단계--");
    while (!circularQueue.isEmpty()) {
      item = circularQueue.dequeue();
      System.out.println("꺼내진 정수: "+item);
      queuePrint();
    }
    System.out.println("큐는 공백상태입니다.");
  }
}
