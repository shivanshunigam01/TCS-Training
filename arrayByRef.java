import java.util.*;

class arraybyRef {

    public static void update(int marks[]) {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            
        }
        
    }

    public static void main(String[] args) {
        int marks[]={79,89,100};
        arraybyRef d=new arraybyRef();
        // d.update();
        update(marks);

       //printing the value of marks
       
       for(int i =0;i<marks.length;i++){
        System.out.println(marks[i]+"");

        
       }
       System.out.println("");
    }
    
  
}
