import java.util.Scanner;
public class IT24103847Lab5Q1
{
public static void main(String[]args)
{
	int num1;
	int num2;
	int num3;
	int largest;
	int smallest;
Scanner input=new Scanner(System.in);
	System.out.println("Enetr the first integer");
	num1=input.nextInt();
	System.out.println("Enetr the second integer");
	num2=input.nextInt();
	System.out.println("Enetr the third integer");
	num3=input.nextInt();
	largest=num1;
if(num2>largest)
{
	largest=num2;
}
if(num3>largest)
{
	largest=num3;
}
	smallest=num1;
if(num2<smallest)
{
	smallest=num2;
}

if(num3<smallest)
{
	smallest=num3;
}

System.out.println("User enterde numbers are"+num1+ " "+num2+" "+num3);
System.out.println("The smallest number is:"+smallest);
System.out.println("The largest number is:"+largest);














}

}
