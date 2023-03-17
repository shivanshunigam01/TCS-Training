
import java.util.Stack;
import java.util.Arrays;

class StockSpan{ 

public class EthCode {
  static void calculateSpan(int price[], int n, int S[]) {
   
    Stack < Integer > st = new Stack < > ();
 st.push(0);

    S[0] = 1;
   
    for (int i = 1; i < n; i++) {
     
      while (!st.empty() && price[st.peek()] <= price[i])
        st.pop();
S[i] = (st.empty()) ? (i + 1) : (i - st.peek());

 
      st.push(i);
    }
  }
  static void printArray(int arr[]) {
    System.out.print(Arrays.toString(arr));
  }
   
 public static void main(String[] args) {
    int price[] = { 10, 4, 5, 90, 120, 80 };
    int n = price.length;
    
int S[] = new int[n];

System.out.println();

    calculateSpan(price, n, S);

    printArray(S);
  }
}
}

