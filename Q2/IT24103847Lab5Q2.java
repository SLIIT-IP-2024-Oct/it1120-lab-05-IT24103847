import java.util.Scanner;
public class IT24103847Lab5Q2
{
	public static void main(String []args)
{
	int num;
	String prize;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of new members introduced");
	num=input.nextInt();

if(num<0)
{
System.out.println("Input must be a number 0 or greater");
}
else{
switch(num){

	case 0:
		prize="No price";
	break;
	case 1:
		prize="Pen";
	break;
	case 2:
		prize="Umbrella";
	break;
	case 3:
		prize="Bag";
	break;
	case 4:
		prize="Travelling chair";
	break;
	default:
		prize="Headphone";
	break;
}

System.out.println("Price is"+prize);

}

















}




}