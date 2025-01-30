import java.util.Scanner;
class AddSub{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st no");
int a = sc.nextInt();
System.out.println("enter 2st no");
int b = sc.nextInt();
a = Math.abs(a);
b = Math.abs(b);
int c = a+b;
System.out.println("Addition value is:"+c);
int d = a-b;
System.out.println("subtraction value is:"+d);

}
}
