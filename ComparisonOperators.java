import java.util.Scanner;
class ComparisonOperators{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter no 1");
int a = sc.nextInt();
System.out.println("enter no 2");
int b = sc.nextInt();
if(a<b){
System.out.println(a + "<" + b + "is true");
}
else{
System.out.println(a + "<" + b + "is false");
}
if(a<=b){
System.out.println(a + "<=" + b + "is true");
}
else{
System.out.println(a + "<=" + b + "is false");
}
if(a>b){
System.out.println(a + ">" + b + "is true");
}
else{
System.out.println(a + ">" + b + "is false");
}
if(a>=b){
System.out.println(a + ">=" + b + "is true");
}
else{
System.out.println(a + ">=" + b + "is false");
}
if(a==b){
System.out.println(a + "==" + b + "is true");
}
else{
System.out.println(a + "==" + b + "is false");
}
if(a!=b){
System.out.println(a + "!=" + b + "is true");
}
else{
System.out.println(a + "!=" + b + "is false");
}

}
}