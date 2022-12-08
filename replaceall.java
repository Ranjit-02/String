public class replaceall{
public static void main(String [] args){
 String s=("India is my country");
String str=s.replaceAll("(?:i)+", "@");
System.out.println(str);
}
}
