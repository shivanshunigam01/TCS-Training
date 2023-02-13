import java.util.*;
class ChineaseRT{
  static int CRT(int a[], int m[], int n, int p){
    int x = 0;
    
    for(int i = 0; i<n; i++){
      
      int M = p/m[i], y = 0; // M1 = p/m1, M2 = p/m2 ....., Mn = p/mn
      
      for(int j=0; j<m[i]; j++){
        if((M*j)%m[i]==1){
          y = j; break; // Finding the values for y1, y2,..., yn
        }
      }
      x = x + a[i]*M*y; // x = a1*M1*y1 + a2*M2*y2 + ... + an*Mn*yn
    }
    
    return x%p; 
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of congruence relations: ");
    int size = sc.nextInt();
    
    System.out.println("Enter the values of a: ");
    int a[] = new int[size];
    for(int i=0; i<size; i++)
      a[i] = sc.nextInt();
    
    System.out.println("Enter the values of m: ");
    int m[] = new int[size], p = 1;
    for(int i=0; i<size; i++){
      m[i] = sc.nextInt();
      p = p*m[i]; // p = m1*m2*...*mn
    } 
    System.out.println("The solution is "+CRT(a,m,size,p));
  }
}