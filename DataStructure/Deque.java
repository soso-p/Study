import java.util.*;
public class Deque {
  private int front;
  private int rear;
  private int MAX_QUEUE_SIZE;
  private int data[];
  
  public Deque(int size) { // 큐 생성
    MAX_QUEUE_SIZE = size;
    data = new int[MAX_QUEUE_SIZE];
  }
  
  private void error(String message) { // 에러 메시지 출력
    System.out.println(message);
  }
  
  public void initDeque() { // 큐 초기화
    rear = 0;
    front = 0;
  }
  
  public void dequePrint() { // 큐 내부 출력
    System.out.println("DEQUE(front="+front+" rear="+rear+") = ");
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
  
  public void addRear(int item) { // 큐 후단 삽입
    if (isFull()) {
      error("큐가 포화상태입니다.");
      return;
    }
    rear = (rear+1)%MAX_QUEUE_SIZE;
    data[rear] = item;
  }
  
  public void addFront(int item) { // 큐 전단 삽입
    if (isFull())
      error("큐가 공백상태입니다.");
    data[front] = item;
    front = (front-1+MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
  }
  
  public int deleteRear() { 큐 후단 삭제
    int prev = rear;
    if (isEmpty())
      error("큐가 공백상태입니다.");
    rear = (rear-1+MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
    return data[prev];
  }
  
  public int deleteFront() { // 큐 전단 삭제
    if (isEmpty()) {
      error("큐가 공백상태입니다.");
      return -1;
    }
    front = (front+1)%MAX_QUEUE_SIZE;
    return data[front];
  }
  
  public int getRear() { // 큐 후단 읽기
    if (isEmpty()) {
      error("큐가 공백상태입니다");
    }
    return data[(front+1)%MAX_QUEUE_SIZE];
  }
  
  public int getFront() { // 큐 전단 읽기
    if (isEmpty())
      error("큐가 공백상태입니다.");
    return data[(front+1)%MAX_QUEUE_SIZE];
  }
  
  public static void main(String args[]) {
    int item = 0;
    Deque deque = new Deque(5);
    
    deque.initDeque();
    for (int i=0;i<3;i++) {
      addFront(i);
      dequePrint();
    }
    for (int i=0;i<3;i++) {
      int item = deleteRear();
      dequePrint();
  }
}
