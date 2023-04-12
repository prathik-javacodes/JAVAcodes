public class javabasics{
  public static void bintodec (int n){
    int decnumb = 0;
    int binnumb = n;
    int power = 0;

    do{                                                                
       int remainder =  binnumb % 10;                                  
     decnumb = decnumb + (remainder * (int)Math.pow(2,power ));     
     power ++;                                                         
     binnumb /= 10;                                                    
    }while(binnumb > 0);
    System.out.print(n+"'s Equivalent decimal is "+ decnumb);
  }

  public static void dectobin(int n){
    int binnumb = 0;
    int power = 0;
    int decnumb = n;

    while(decnumb>0){
     int remainder = decnumb%2;
     binnumb = binnumb + (remainder *(int)Math.pow(10,power ));
     power++;
     decnumb /= 2; 
    }
    System.out.print(n+"'s Equivalent binary is "+ binnumb);

  }

  public static void check (int array[]){
    int  dummy = array [0];
    array[0] = array[8];
    array[8] = dummy;
    }
  public static void printarray(int array[]){

    for (int i=0 ; i<array.length ; i++){
        System.out.print(array[i]+" ");
    }
}
  public static void main (String args[]){
    // bintodec(101);
    // dectobin(7);
    int array[] ={1,2,3,4,5,6,7,8,9};
    check(array);
    printarray(array);
  }
}