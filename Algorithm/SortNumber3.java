import java.io.*;
public class SortNumber3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int number[] = new int[n];
        int sortedNumber[] = new int[n];
        int maxNumber = 0;
        
        for (int i=0;i<n;i++) {
            number[i] = Integer.parseInt(br.readLine());
            if (maxNumber < number[i])
                maxNumber = number[i];
        }
        br.close();
        
        int countingArray[] = new int[maxNumber+1];
        int countSum[] = new int[maxNumber+1];
        
        countNumber(countingArray, number);
        calculateCountSum(countingArray, countSum);
        countingSort(countSum, number, sortedNumber);
        
        for (int i=0;i<n;i++) {
            bw.write(sortedNumber[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    
    // 각 수의 등장횟수 구하기
    public static void countNumber(int countingArray[], int number[]) {
        for (int i=0;i<number.length;i++) {
            countingArray[number[i]]++;
        }
    }
    
    // 각 수의 누적 합 구하기
    public static void calculateCountSum(int countingArray[], int countSum[]) {
        countSum[0] = countingArray[0];
        
        for (int i=1;i<countingArray.length;i++) {
            countSum[i] = countSum[i-1] + countingArray[i];
        }
    }
    
    // Counting Sort
    public static void countingSort(int countSum[], int number[], int sortedNumber[]) {
        for (int i = number.length-1;i>=0;i--) {
            sortedNumber[countSum[number[i]]-1] = number[i];
            countSum[number[i]]--;
        }
    }
}
