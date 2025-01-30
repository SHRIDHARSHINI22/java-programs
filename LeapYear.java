import java.util.Scanner;
class LeapYear{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a year");
int year = sc.nextInt();
if(isLeapYear(year)){
System.out.println("It is leap year");
}
else{
System.out.println("It is not leap year");
}
}
static Boolean isLeapYear(int year){
return(year % 400 == 0)||(year % 4 == 0 && year % 100 != 0);
}
}