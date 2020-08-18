import java.util.*;
public class Statistics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        double sum = 0;
        // 수의 개수 저장
        HashMap<Integer, Integer> countNumber = new HashMap<Integer, Integer>();
        
        for (int i=0;i<n;i++) { // 수 입력, 수 개수 count, 전체 총 합 구하기
            number[i] = sc.nextInt();
            sum += number[i];
            if (!countNumber.containsKey(number[i])) {
                countNumber.put(number[i], 1);
            }
            else {
                countNumber.put(number[i], countNumber.get(number[i])+1);
            }
        }
        
        int maxValue = Integer.MIN_VALUE;
        ArrayList<Integer> keyList = new ArrayList<Integer>();
        for (int key : countNumber.keySet()) { // 최빈 값이 여러 개일 경우 두 번째로 작은 값으로
            if (countNumber.get(key)>maxValue) {
                maxValue = countNumber.get(key);
                keyList.clear();
                keyList.add(key);
            }
            else if (countNumber.get(key)==maxValue) {
            	keyList.add(key);
            }
        }
        Collections.sort(keyList);
        
        int average = (int)Math.round(sum/n);
        	
        Arrays.sort(number);
        System.out.println(average); // 산술 평균
        System.out.println(number[n/2]); // 중앙 값
        
        if (keyList.size()>1) // 최빈 값이 여러 개일 경우
        	System.out.println(keyList.get(1));
        else
        	System.out.println(keyList.get(0));
        
        System.out.println(Math.abs(number[n-1]-number[0])); // 입력 값의 범위
    }
}
