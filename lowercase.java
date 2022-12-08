public class lowercase{
    public static void main(String args[]){
             String s = "India is my country"; 
      int lowercase=0,special=0;    
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                lowercase++;
            }
            else{
                special++;
            }
        }
 
        System.out.println("Lower case letters : " + lowercase);
    }
}




