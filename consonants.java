public class consonants{
    public static void main(String args[]){
         String s = "india is my country";  
      int count=0;   
        for(int i = 0; i < s.length(); i++) {  
    char ch = s.charAt(i);  
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){     
        System.out.println(' ');    
    } 
else
{
System.out.println(s.charAt(i));
count=count+1;
}
}   
}  
}   
