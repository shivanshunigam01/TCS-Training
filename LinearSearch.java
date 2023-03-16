
class LinearSearch{
    public static int LinearSearch(int numbers[], int key) {
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key)
{
    return i;
}        
}
 return -1;       
    }
    public static void main(String[] args) {
        int numbers[]={6,8,10,20,50,60};
        int key=10;
        LinearSearch d = new LinearSearch();
        System.out.println("Key is found at the index:"+LinearSearch(numbers, key));
    
    
    }
}