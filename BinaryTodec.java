public class BinaryTodec {

public static void BinToDecimal(int binNum){
    int pow=0;
    int dec=0;
    while(binNum>0){
    int LastDig=binNum%10;
    dec=dec+LastDig*(int)Math.pow(2, pow);
        pow++;
    binNum=binNum/10;

    }
    System.out.println(dec);
}



public static void main(String[] args) {
    BinToDecimal(1010)
    ;
}    
}
