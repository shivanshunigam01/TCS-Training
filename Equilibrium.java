import java.util.Scanner;

public class Equilibrium 
{  
 
static int eqbmindex(int array[], int n)  
{  
int i, j;  
  
int lsum, rsum;  
for (i = 0; i < n; i++)   
{  
lsum = 0;  
  
for (j = 0; j < i; j++)  
lsum = lsum + array[j];  
rsum = 0;  
  
for (j = i + 1; j < n; j++)  
rsum = rsum + array[j];  
 
if (lsum == rsum)  
return i;  
}  
return -1;  
}  
public static void main(String args[])  
{  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
int array[] =new int[size];
//for input
for(int i=0;i<size;i++){
    array[i]=sc.nextInt();
}
int arraysize = array.length;  
 
System.out.println(eqbmindex(array, arraysize));  
}  
}  