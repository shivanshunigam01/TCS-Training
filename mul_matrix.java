import java.util.Scanner;

public class mul_matrix{  
    public static void main(String args[]){     
    int a[][]=new int[3][3];   
    int b[][]=new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first matrix");
    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<=2;j++)
        a[i][j]=sc.nextInt();  
    }
    System.out.println("Enter second matrix");
    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<=2;j++)
        b[i][j]=sc.nextInt();  
    }
        
       
    int c[][]=new int[3][3];  
    
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    c[i][j]=0;      
    for(int k=0;k<3;k++)      
    {      
    c[i][j]+=a[i][k]*b[k][j];      
    }  
    System.out.print(c[i][j]+" ");  
    }
    System.out.println();    
    }    
    }}