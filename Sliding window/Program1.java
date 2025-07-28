//1876. Substrings of Size Three with Distinct Characters
import java.util.HashSet;
class Program1{
          public static boolean fun(String subStr){
             HashSet <Character> hs = new HashSet<>();
             int count = 0;
             boolean ans = false;
             for(int i = 0;i < subStr.length();i++){
                 char key = subStr.charAt(i);
                 hs.add(key);
             }
             if(subStr.length() == hs.size()){
                 return true ;
             }
            return ans;
    }
    
    
    
    
    public static void main(String[] args) {
    
        String str = "xyxabxc";
        int count = 0;
        for(int i = 0 ; i<= str.length()-3; i++){
            if(fun(str.substring(i,i+3)) == true)
            count++;
            
        }
        System.out.println(count);
    }
    
    
   
    
    
}