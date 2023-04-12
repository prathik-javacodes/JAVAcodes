public class patterns {
    public static void printhollrect(int nosofrows ,int nosofcols){
        for (int i=1 ; i<=nosofrows ; i++){
            for (int j=1 ; j<=nosofcols ; j++){
                if ( i==nosofrows || (j==(nosofcols-1)&&i==(2)) || (j==(nosofcols-1)&&i==(3)) || (j==(2)&&i==(3)|| j==nosofcols )){
                 System.out.print("*");
                 }else{
                 System.out.print(" ");
                 }
            }System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
       for(int i=1 ; i<=n ; i++){
        for(int j=1 ; j<=n-i ; j++){
            System.out.print(" ");
        }for (int j=1 ; j <=i ; j++){
            System.out.print("*");
        }System.out.println();
       }
    }

    public static void invhalfpyramid(int n){
     for (int row=1 ; row<=n ; row++){
        for (int column=1 ; column<=(n-row+1);column++){
            System.out.print(column);
        }System.out.println();
     } 
    }

    public static void floydstriangle(int n){
       int counter =1;
        for(int row=1 ; row<=n ; row++){
            for ( int column = 1; column<=row ; column++){
                System.out.print(counter+" ");
                counter ++;
            }System.out.println();
        } 

    }
    public static void zero_one_triangle (int n){
        for (int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }

    }

    public static void print_butterfly(int n ){
        for( int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
               System.out.print("/");
            }   
             for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
             }

            for(int j=1 ; j<=i ; j++){
                System.out.print("/");

            } System.out.println();

        }
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("/");
             }   
              for(int j=1 ; j<=2*(n-i) ; j++){
                 System.out.print(" ");
              }
 
             for(int j=1 ; j<=i ; j++){
                 System.out.print("/");
 
             } System.out.println(); 
        }
    }
     public static void solid_rhombus(int n){
        for (int i=1 ; i<=n ; i++){
             for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
             }
             for(int j=1 ; j<=n ; j++){
                System.out.print("/");
             } System.out.println();

        }
     }

     public static void hollow_rhombus(int n){
        for (int i=1 ; i<=n ; i++){
             for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
             }
             for(int j=1 ; j<=n ; j++){
                if(i==1 || i==n || j==1 || j==n){
                System.out.print("/");}
                else{
                    System.out.print(" ");}

                }System.out.println();
             } 

        }
       

        public static void print_diamond (int n){
            int star = 1;
            for(int i=1 ; i<=n ; i++){
                for(int j=1 ; j<=(n-i) ; j++){
                    System.out.print(" ");
                }
                for (int j=1 ; j<=star ;j++){
                    System.out.print("*");
                }System.out.println();
                star= star+2;
            }
            int down_star = n*2-1;
            for(int i=n ; i>=1 ; i--){
                for(int j=1 ; j<=(n-i) ; j++){
                    System.out.print(" ");
                }
                for (int j=1 ; j<=down_star ;j++){
                    System.out.print("*");
                }System.out.println();
                down_star= down_star-2;
            }

        }

     

    public static void main (String args[]){
     printhollrect(4, 4);
     System.out.println();
     inverted_rotated_half_pyramid(5);
     System.out.println();
     invhalfpyramid(5);
     System.out.println();
     floydstriangle(13);
     System.out.println();
     zero_one_triangle(10);
     System.out.println();
     print_butterfly(20);
     System.out.println();
     solid_rhombus(10);
     System.out.println();
     hollow_rhombus(10);
     System.out.println();
     print_diamond(10);

    }
}
