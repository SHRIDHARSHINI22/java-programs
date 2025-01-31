import java.util.Scanner;
class WashingMachine{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the weight of clothes(in grams):");
int weight = sc.nextInt();
if(weight<0){
System.out.println("INVALID INPUT");
return;
}
else if(weight>7000){
System.out.println("OVERLOADED");
return;
}
System.out.println("Enter the level of water(L for low, M for medium, H for high):");
char waterLevel = sc.next().charAt(0);
int timeEstimate = 0;
switch(waterLevel)
{
case 'L':
if(weight>0 && weight<=2000){
timeEstimate=25;
}
else {
System.out.println("INVALID INPUT");
return;
}
break;

case 'M':
if(weight>2001 && weight<=4000){
timeEstimate = 35;
}
else {
System.out.println("INVALID INPUT");
return;
}
break;

case 'H':
if(weight>4000 && weight<=7000){
timeEstimate = 45;
}
else {
System.out.println("INVALID INPUT");
return;
}
break;

default:
System.out.println("INVALID INPUT");
return;
}
System.out.println("Time Estimate:" + timeEstimate + "minutes");
}
}
