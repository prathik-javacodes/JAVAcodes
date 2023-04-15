public class Strings {

    public static void PrintLetters (String str ){  // Function or method to print Each cell value one by one of string
        for(int i=0 ; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
    }

    public static boolean Palindrome (String str){ //Palindrome is word which gives same word if it is read from back 
       int i = 0 , j= str.length();
        for ( i=0 ; i<str.length()/2 ; i++ ){
         if(str.charAt(i) != str.charAt(j-1-i)){
            return false;
         }
       }
       return true;
    }

    public static float FindShortestPath (String str ){   // String str = "WNEENESENNN";
                                                          //System.out.print(FindShortestPath(str));
        int X=0 , Y=0;
     for (int i=0 ; i<str.length() ; i++ ){
        char direction = str.charAt(i);

        if(direction == 'S'){
          Y--;
        }
        else if(direction == 'N'){
          Y++;
        }
        else if(direction == 'E'){
            X++;
        }
        else {
            X--;
        }
     }
      int X2 = (X*X);
      int Y2 = (Y*Y);

      float Answer = (float)Math.sqrt(X2+Y2); //type cast
      return Answer;

    }

    public static void PrintSubstring (String str, int si , int ei){  //si=starting index  &   ei= Ending Index
     for(int i=si ; i<ei ; i++){      //if index is from 0 to 5 then it will only print from 0 to 4 since in condition there is < sign not <= sign
      System.out.print(str.charAt(i));
     }
    }

    public static String FirstwordtoUpperCase (String str){ // function to convert starting letter of all word Capital
      StringBuilder sb = new StringBuilder("");
      
      char ch = Character.toUpperCase(str.charAt(0));  // to do capital of  first letter at 0th index capital using Character.toUpperCase
       sb.append(ch);
      for(int i=0 ; i<str.length() ; i++){
       if(str.charAt(i)== ' ' && i<str.length()-1){
         sb.append(str.charAt(i));  // to append space to our sb(stringbuilder)
         i++;                        // increment i
         char capitalletter = Character.toUpperCase(str.charAt(i)); //to convert ith  letter to capital using Character.toUpperCase
         sb.append(capitalletter);
        }else{             // to append other letter rather than after space
          sb.append(str.charAt(i));
        }
      }
      return sb.toString();   //  to convert it into string
    }

    public static String StringCompression (String str){
      StringBuilder sb = new StringBuilder("");
      for (int i=0 ; i<str.length() ; i++){
        Integer count = 1;
       while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)  ){      // this code is using String Builder  and  the below one is without using String Builder
        count++;       
         i++;
       }
       sb.append(str.charAt(i));
       if(count>1){
        sb.append(count.toString());
       }
      }                                                                      
      return sb.toString();
    }

    // public static String StringCompression(String str) {
    //  String newstr = "";
    //  for (int i=0 ; i<str.length() ; i++){
    //   Integer count=1;
    //   while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)   ){
    //     count++;
    //     i++;
    //   }
    //   newstr+=str.charAt(i);
    //   if(count>1){
    //     newstr += count.toString();
    //   }
    //  }
    //  return newstr;
    // }
   public static void main (String args[]){
   String fullname = "abhfffff";
   System.out.print(StringCompression(fullname));
   }
}

