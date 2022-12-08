public class Stringreverse{
public static void main(String [] args){
String orginal="Ranjith";
String reverse="";
for(int i=orginal.length()-1;i>=0;i--)
{
reverse=reverse + orginal.charAt(i);
}
System.out.println(reverse);
}
}
