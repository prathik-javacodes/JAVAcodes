public class arrays {
    public static void update(int marks[]){
        for(int i=0 ; i<marks.length ; i++){
           marks[i] = marks[i]+1;   //marks at each element of array will be incremented by 1
        }
    }

    public static int linearsearch (int number[], int key){//function to search desired element in array
        for(int i=0 ; i<number.length ; i++){    //number.length to traverse array from 0th index to lrngth of array
            if(number[i] == key){
                return i;
            }
        }return -1;
    }

    public static int getlargest(int number[]){  //function to get largest integer from array
        int largest = Integer.MIN_VALUE;    // minus infinity
        int smallest = Integer.MAX_VALUE;    // plus infinity

        for(int i=0 ; i<(number.length) ; i++){
          if(number[i]>largest){
            largest = number[i];
          }if(number[i] < smallest){    //here we can also find smallest number
            smallest = number[i];
          }
        }
        System.out.println("smallest number is : "+smallest);  //we cant return 2 things simultaneously therefore printed here only
        return largest;
    }
public static void even(int array[]){  //Even number in an array also index of that number and nos. of even number
    int count=0;
    for (int i=0 ; i<array.length ; i++){
        if(array[i]%2==0){
            System.out.print(array[i]+" at index "+i+"\n");
            count++;
        }
    }
    System.out.println();
    System.out.print("Total "+count+" Even Number present in an array");
    System.out.println();
    System.out.println();
}
public static void odd(int array[]){  //Even number in an array also index of that number and nos. of even number
    int count=0;
    for (int i=0 ; i<array.length ; i++){
        if(array[i]%2!=0){
            System.out.print(array[i]+" at index "+i+"\n");
            count++;
        }
    }
    System.out.println();
    System.out.print("Total "+count+" odd Number present in an array");
    System.out.println();
    System.out.println();
}

public static int binarysearch(int array[],int key){//for binary search we need sorted array
    int start=0 , end=array.length-1;

    while(start<=end){
        int mid = (start+end)/2;
        if(array[mid]==key){
          return mid;
        }
         if(key>array[mid]){
            start = mid+1;
         }else{
            end = mid-1;
         }
    }
    return -1; //if key not present in an array return-1

}

public static void ReverseArray(int array[]){//Function to reverse an array
    int i=0, j=array.length-1;
    while(i<j){  //this is optimised approach since elements in array is swaped till middle of an array
        int temp = array[j]; //swap technique is used (by creating temperary variable) to reverse array 
        array[j]=array[i];
        array[i]=temp;
        i++;
        j--;
    }
    
}

public static void PairsInArray (int array[]){//creating non-repeating pairs in an array
    int start=0 , end=array.length-1;
    for(int i=start ; i<=end ; i++){
        for(int j=i+1 ; j<=end ; j++){
            System.out.print("("+array[i]+","+array[j]+")  ");
        }System.out.println();
    }
}

public static void PrintSubArray (int array[]){//this code not only print subarray but also give sum of each sub array and what is maximum sum and minimum sum also
    int start=0 , end=array.length-1;
    int sum=0;
    int largest = Integer.MIN_VALUE;    // minus infinity
        int smallest = Integer.MAX_VALUE; //plus infinity
      for(int i=start ; i<=end ; i++){
        for(int j=i ; j<=end ; j++){
            for(int k=i ; k<=j ; k++){
            System.out.print(array[k]+" " );
             sum = sum + array[k];
            }System.out.print("       sum is : "+sum);
            if(sum>largest){
                largest = sum;
            }if(sum<smallest){
                smallest = sum;
            }
            sum = 0;
            System.out.println();
        }System.out.println();
      } 
      System.out.println("largest sum is : " +largest);
      System.out.println("smallest sum is : " +smallest);
    }

    public static void MaxSumInSubarray (int array[]){  //Brute force (that is normal logic or non-omptimised logic )
        int start=0 , end=array.length-1 ;
        int currentsum=0;
         int maxsum=Integer.MIN_VALUE;
        for (int i=start ; i<=end ; i++){
            for (int j=i ; j<=end ; j++){
                for (int k=i ; k<=j ; k++){
                    currentsum=currentsum+array[k];

                }if(currentsum>maxsum){
                    maxsum=currentsum;
                }
                System.out.println(currentsum);
                currentsum=0;
            }System.out.println();
        }
        System.out.print("Max sum of subarray is : "+maxsum);  //TimeComplexity = O(n^3)   since 3 nested loop 
    }

    

    public static void prefixsum (int array[]){
        
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        for(int i=1 ; i<array.length ;i++){
            prefix[i] = prefix[i-1] + array[i];

        }

        for(int i=0 ; i<=array.length-1 ;i++){
            int start = i;
            for(int j=i ; j<=array.length-1 ; j++){
                int end = j;

                 sum = start == 0 ? prefix[end] : (prefix[end] - prefix[start-1]);

                if(sum>largest ){
                    largest = sum;
                }
            }
        }
          
             System.out.print("Largest Sum of subarray is : "+largest );    //TimeComplexity = O(n^2) since 2 nested loop 
    }
  
     public static void kadanes (int array[]){ // kadanes algorithm says that if big negative number and small positive number is added than instead of taking negative number as a sum take it zero
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;

        for(int i=0 ; i<array.length ; i++){
            currentsum = currentsum + array[i];
            if(currentsum < 0){
                currentsum = 0;
            }
            maxsum = Math.max(currentsum,maxsum);
        }
        System.out.print("Maximum sum of subarray is : "+maxsum); //TimeComplexity = O(n) since single loop used
     }

     public static void tappingwater (int height[]){ //array is {4,2,0,6,3,2,5}
        int n= height.length;
        int MaxAtLeft[] = new int [n];  // made new array to store longest height at its left // auxillary array 
        int MaxAtRight[] = new int [n]; // made new array to store longest height at its right // auxillary array
        MaxAtLeft[0] = height[0];
        for(int i=1 ; i<n ; i++){
          MaxAtLeft[i]=Math.max(height[i],MaxAtLeft[i-1]); //array storing value of maximum height to its left 
        }  
        MaxAtRight[n-1] = height[n-1];     
        for (int i=n-2 ; i>=0 ; i--){
            MaxAtRight[i] = Math.max(height[i],MaxAtRight[i+1]); //array storing value of maximum height to its right 
        }
        int TrappedWater = 0;
        for(int i =0 ; i<height.length ; i++ ){
            int waterlevel = Math.min(MaxAtLeft[i], MaxAtRight[i]); //Finding level of water 
            TrappedWater += (waterlevel-height[i]); //formula is water level that can be stored in that building - minus  height of the building multiplied by width of the building
        }
        System.out.print("Total Trapped Water is : "+TrappedWater); //Answer is 11
        }

         public static void BuyAndSell (int prices[]){
            int buyprice = Integer.MAX_VALUE;
            int maxprice = 0;

            for(int i=0 ; i<prices.length ; i++){
                if(buyprice<prices[i]){
                    int profit =  prices[i] - buyprice ;
                     maxprice = Math.max(maxprice, profit);
                }else{
                    buyprice = prices[i];
                }
            }
            System.out.print("Maximum "+maxprice+" profit can be achieved");
         }

         // homework or practise problem from here 

         public static boolean occurence (int array[]){
            int n = array.length - 1;
           for(int i=0 ; i<=n ; i++){
            for (int j=i+1 ; j<=n ; j++){
                if(array[i]==array[j]){
                   return true;
                }
            }
           }
           return false;
        }

        // last problem 

        public static void triplets (int array []){
            for (int i=0 ; i<array.length ; i++ ){
                for (int j=i+1 ; j<array.length ; j++ ){
                    for (int k=j+1 ; k<array.length ; k++ ){
                        if(i!=j && i!=k && j!=k &&( array[i] + array[j] + array[k] == 0)){
                            System.out.println(array[i]+"\t"+array[j]+"\t"+array[k]);
                        }
                    }
                }            }
        }
        
     

 public static void main(String args[]){
        int array[] = {-1, 0,  1, 2, -1, -4};
        triplets(array);        
        }
}    

