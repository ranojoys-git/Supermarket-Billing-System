import java.io.*;
public class Billing1
{
    public static void main()throws IOException
    {
        Billing obj=new Billing();
        Loading obj1=new Loading();
        obj1.load();
        obj.dateDisplay();
        obj.menuDisplay();
        obj.purchase();
    }
}
