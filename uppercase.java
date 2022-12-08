public class uppercase{
    public static void main(String args[]){
             String s = "India is my country"; 
      int uppercase=0,special=0;    
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
       if (ch >= 'A' && ch <= 'Z'){
                uppercase++;
          }
            else{
                special++;
           }
        }
      System.out.println("Upper case letters : " + uppercase);
    }
}
