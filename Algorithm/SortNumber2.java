import java.io.*;
public class SortNumber2 {
    static int sortedNumber[];
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int number[] = new int[n];
        sortedNumber = new int[n];
        
        for (int i=0;i<n;i++) {
            number[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        mergeSort(number, 0, n-1);
        for (int i=0;i<n;i++) {
            bw.write(number[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    
    public static void mergeSort(int number[], int left, int right) { // 합병정렬
        if (left<right) {
            int mid = (left+right)/2;
            
            mergeSort(number, left, mid);
            mergeSort(number, mid+1, right);
            merge(number, left, mid, right);
        }
    }
    
    public static void merge(int number[], int left, int mid, int right) { // 나눈 두 배열을 합치기
        int leftIndex = left;
        int rightIndex = mid+1;
        int index = left;
        
        while (leftIndex <= mid && rightIndex <= right) {
            if (number[leftIndex] <= number[rightIndex])
                sortedNumber[index++] = number[leftIndex++];
            else
                sortedNumber[index++] = number[rightIndex++];
        }
        
        while (leftIndex <= mid) {
            sortedNumber[index++] = number[leftIndex++];
        }
        while (rightIndex <= right) {
            sortedNumber[index++] = number[rightIndex++];
        }
        
        for (int i=left;i<=right;i++) {
            number[i] = sortedNumber[i];
        }
    }
}
