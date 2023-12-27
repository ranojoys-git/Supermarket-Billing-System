import java.util.*;
public class ScannerInput
{
    public static String askString(String q)
    {
        Scanner input= new Scanner(System.in);
        String str="";
        System.out.print(q);
        str=input.nextLine();
        input.close();
        return str;
    }//end of askString method
    public static int askInt(String q)
    {
        Scanner input= new Scanner(System.in);
        int n=0;
        boolean valid;
        String flush;
        do
        { 
            valid=true;
            System.out.print(q);
            if(input.hasNextInt()==true)
                n=input.nextInt();
            else
            {
                valid=false;
                System.out.println("Wrong Datatype. Enter again");
                flush=input.nextLine();
            }
        }while(valid==false);
        input.close();
        return n;
    }//end of askInt method
    public static double askDouble(String q)
    {
        Scanner input= new Scanner(System.in);
        double n=0.0;
        boolean valid;
        String flush;
        do
        {
            valid=true;
            System.out.print(q);
            if(input.hasNextDouble()==true)
                n=input.nextDouble();
            else
            {
                valid=false;
                System.out.println("Wrong Datatype. Enter again");
                flush=input.nextLine();
            }
        }while(valid==false);
        input.close();
        return n;
    }//end of askDouble Method
}//end of class

         