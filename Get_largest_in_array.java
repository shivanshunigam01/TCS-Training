public class Get_largest_in_array {
    public static int  Get_largest(int numbers[]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){

                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("The smallest value is:"+smallest);
        return largest;
       
    }
   
    public static void main(String[] args) {
        int numbers[]={1,2,5,8,4,7,5,6,9};
        
        System.out.println("The largest element of the array is:"+Get_largest(numbers));
    
        
    
    }
    
}
