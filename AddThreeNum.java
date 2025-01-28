import java.util.Scanner;
class AddThreeNum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a:");
int a = sc.nextInt();
System.out.println("enter b:");
int b = sc.nextInt();
System.out.println("enter c:");
int c = sc.nextInt();
int d = a+b+c;
System.out.println("addition of three numbers:"+d);
}
}