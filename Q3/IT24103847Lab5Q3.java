
import java.util.Scanner;
    public class IT24103847Lab5Q3
    {
        public static final double room_charge=8000;
        public static final int dicount3to4=10;
        public static final int discount5tomore=20;
        public static void main(String []args)
        {
        int start_day;
        int end_day;
        int numberofdates;
        double totalcharges;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Start Date");
        start_day=input.nextInt();
        System.out.println("Enter End Date");
        end_day=input.nextInt();
        if(start_day<1 || start_day>31 || end_day<1 || end_day>31)
        {System.out.println("Error: Days must be between 1 and 31");
        return;
    }
       else if (start_day >= end_day)
        {
            System.out.println("Error: Start Day must be less than End Date");
            return;
        }
        else
        {
            numberofdates=end_day-start_day;
            totalcharges=numberofdates*room_charge;
            if (numberofdates>3 && numberofdates<5)
           { double discount10=totalcharges*(dicount3to4/100);
            double totalamount10=totalcharges-discount10;
            System.out.println("Rooom charges"+totalamount10);
            return;
        }
        else if (numberofdates>=5)
        {
            double discount20=totalcharges*(discount5tomore/100);
            double totalamount20=totalcharges-discount20;
            System.out.println("Rooom charges"+totalamount20);
            return;}
         else
            {
                System.out.println("Room charges"+room_charge);
            }

        }
            

        }
    
    
    
    
    
    
    
    }

