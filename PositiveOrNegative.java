import java.util.Scanner;
class PositiveOrNegative{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int a = sc.nextInt();
if(a>0){
System.out.println("It is positive");
}
else if(a==0){
System.out.println("Invalid");
}
else{
System.out.println("It is negative");
}
}
}
