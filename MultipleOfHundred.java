import java.util.Scanner;
class MultipleOfHundred{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
if(num % 100 == 0){
System.out.println(num +"is a multiple of 100");
}
else{
System.out.println(num +"is not a multiple of 100");
}
}
}
