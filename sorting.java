

public class sorting{
    public static void bubbleSort(int array[]) {
        for (int i=0 ; i<array.length-1 ; i++){
            for (int j=0 ; j<array.length-1-i ; j++){
                if(array[j]>array[j+1]){
                    //swap
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1] = temp;
                 }
             }
        
        }
    }

    public static void printarray(int array[]){

        for (int i=0 ; i<array.length ; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void SelectionSort (int array[]){
        for(int i=0 ; i<array.length-1; i++){ //Outer loop till n-1
            int  minimumElementAtIndex = i;  //considering i th element as minimum 
            for (int j=i+1 ; j<array.length ; j++){//Iner loop till n
                // Inner loop will compare with the value of i th element 
                // if j th element is less than i th element than variable will store the value of j 
                if (array[ minimumElementAtIndex]>array[j]){  // if want in descending order just put < insted of > in condition 
                    
                    minimumElementAtIndex = j; // 
                }
            }
            //swap
            int temp = array[minimumElementAtIndex];
            array[ minimumElementAtIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void  InsertionSort (int array []){
        for (int i=1 ; i<array.length ; i++){
            int curr = array[i];
            int prev = i-1;
            while(prev >= 0 && curr < array[prev]){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }

    public static void CountingSort (int array[]){
        int largest = Integer.MIN_VALUE; //minus infinity  
      for (int i=0 ; i<array.length ; i++){
          largest = Math.max(largest,array[i]); //after traversing array we will get the largest element form the array
      }

      int count[] = new int [largest+1]; //will make new array "count" to track the frequency of the number occuring 
      for (int i=0 ; i<array.length ; i++){
           count[array[i]]++;         // and will store the frequency of particular number at particular index
      }
       int j=0; //to track  index of main array named "array"
      for(int i=0 ; i<count.length ; i++){
        while (count[i]>0){ // run till count becomes 0
         array[j]=i; // to store the number 
         j++; //increment index of array "array"
         count[i]--; // decrement number of count
        }
      }

      

    }
    public static void main (String args[]){
    


      }

}