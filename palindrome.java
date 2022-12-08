public class palindrome{
public static void main(String [] args){
String orginal="madam";
String reverse="";
for(int i=orginal.length()-1;i>=0;i--)
{
reverse=reverse + orginal.charAt(i);
}
System.out.println(reverse);
if(orginal.equals(reverse)){
System.out.println("palindrome");
}
else
{
System.out.println("non palindrome");
}
}
}
