import java.io.*;
public class Loading
{
    public static void load()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\f");
        int i,j,k;
        System.out.print("\n\n\n\n\t\t\t Loading Please Wait. ");
        for(i=1;i<=20;i++)
        {
            System.out.print(". ");
            for(j=1;j<=1000;j++)
            {
                for(k=1;k<=100000;k++)
                {}
            }
        }
        System.out.print("\n\n\n\n\t\t\t Loading Complete. ");
        System.out.print("\n\n\t\t\t Press any key and enter to continue.. ");
        String s=br.readLine();
        System.out.println("\f");
    }
}