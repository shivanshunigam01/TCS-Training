public class pairsum {
    public static void check(int array[], int sum) {
        int i=0;
        int j=array.length-1;
        int index = array[i];
        int last = array[j];

        if((index+last)==sum){
            System.out.println(i+" "+j);
        }
        if((index+last)>sum){
            System.out.println(i+" "+j);
            i++;
        }
        if((index+last)<sum){
            System.out.println(i+" "+j);
        j--;
        }
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        int sum=8;
        check(array, sum);
        
    }
}
