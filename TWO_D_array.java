
public class TWO_D_array{

    public static boolean search (int  matrix [][], int key ){
        for (int i=0 ; i<matrix.length  ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                if( matrix [i] [j] == key ){
                    System.out.print("Element found at point ( " +i+ ","+j+" )");
                    return true ;
                }
            }
        }
        System.out.print("Not Found");
        return false;
    }

    public static void spiralmatrix (int matrix[][] ){
        int startcol = 0;
        int startrow = 0;
        int endcol = matrix[0].length-1;
        int endrow = matrix.length -1;

        while (startcol <= endcol && startrow <= endrow){

            // print top  from left to right 
            for (int j=startcol ; j<=endcol ; j++){
              System.out.print(matrix[startrow][j]+" ");
            }
            
            //print right  from top to bottom
            for (int i=startrow+1 ; i<=endrow ; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //print bottom    from left to right
            for (int j=endcol-1 ; j>=startcol ; j--){
                if(startrow==endrow){
                   break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //print left    from  bottom to up
            for (int i=endrow-1 ; i>=startrow+1 ; i--){
                if(startcol==endcol){
                    break;
                 }

                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endrow--;
            endcol--;

        }
        System.out.println();
    }

    public static void DiagonalSum (int matrix [][]){

        int sum =0 ;

        // for(int i=0 ; i<=matrix.length-1 ; i++){               //Brute Force Approach having time complexity O(n^2)
        //     for (int j= 0 ; j<= matrix[0].length-1 ; j++){
        //         if(i == j ){
        //             sum+= matrix[i][j];
        //         }
        //         else if (i+j == matrix.length-1){              //i+j = n-1
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }

        for (int i = 0 ; i<= matrix.length-1 ; i++){
            sum+= matrix[i][i];
            //i+j = n-1
            //j = n-1-i   //here,  n is matrix.length 
            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
      System.out.print(sum);

    }

    public static boolean SearchInMatrix (int matrix[][],int key){ //following sorted matrix is below
      int row = 0 , col = matrix[0].length-1;               // int matrix [][] = {{10,20,30,40},
                                                            //                    {15,25,35,45},
                                                            //                    {27,29,37,48},
                                                            //                    {32,33,39,50}}
      while(row < matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("Find the element at cell ("+row+","+col+")");
                return true;
            }
            else if (key<matrix[row][col]){
                col--;
            }else {
                row++;
            }
         }     
     System.out.println(key+" not found in a matrix");
     return false;

    }

    public static void main (String args[]){
        int matrix [][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}

                          };
     int key = 37;
     SearchInMatrix(matrix,key);


      }

        
}