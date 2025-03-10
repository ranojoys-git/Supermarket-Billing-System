import java.util.*;

public class Billing {
    // pid[] stores the product id 
    static int pid[] = {10011, 10012, 10013, 10014, 10015, 10016, 10017,
            10018, 10019, 10020, 10021, 10022, 10023, 10024, 10025, 10026, 10027,
            10028, 10029, 10030, 10031, 10032, 10033, 10034, 10035, 10036, 10037,
            10038, 10039, 10040, 10041, 10042};
    // pname[] stores the product name    
    static String pname[] = {"Camel Gel Pens   ", "Camel Glitter Pens ",
            "Camel Refill     ", "Camel Felt Pens     ", "Camel Pencils     ",
            "Camel Colour Pencils", "Camel Ruler     ",
            "Camel Rubber        ", "Camel Sharpener       ",
            "Camel Scissors      ", "Camel Marker      ",
            "Camel Whitener      ", "Camel Water Colours ",
            "Camel Poster Paints  ", "Camel Paint Brushes",
            "Camel Cellotape     ", "Camel Glue       ", "Camel Gluestick     ",
            "Camel Notebook(Size 4)", "Camel Notebook(Size 6)",
            "Camel Notebook(Size 8)", "Camel Diary     ", "Camel Geometry Set",
            "Chart Paper       ", "Marble Paper    ", "Hand Made Paper    ",
            "Gift Paper(Plastic)", "Gift Paper(Paper)", "Fluorescent Paper",
            "Cellophane Paper", "Pen Stand         ", "Paper Cutter     "};
    // price[] stores the product price    
    static double price[] = {10.00, 120.00, 6.00, 65.00, 29.00, 45.00, 9.00, 3.50,
            4.00, 19.00, 32.00, 54.00, 55.00, 105.00, 5.00, 20.00, 10.00,
            25.00, 7.00, 15.00, 29.00, 250.00, 49.00, 3.50, 5.00, 8.00, 5.00,
            3.00, 6.00, 2.00, 38.00, 16.00};

    public static void purchase() {
        System.out.println();
        int sold[] = new int[20]; // stores the product id of the items that are sold
        int count = 0; // stores the number of products sold
        int qty[] = new int[20]; // stores the quantity of the items sold
        String choice = "Y"; // stores the choice to purchase any more items

        while (choice.equalsIgnoreCase("Y")) {
            menuDisplay();
            try {
                int id = ScannerInput.askInt(" Enter the Product ID : ");
                System.out.println("\f");
                if (isValidProductId(id)) {
                    handlePurchase(id, sold, qty, count);
                    count++;
                } else {
                    System.out.println("Invalid Product ID ");
                }
            } catch (Exception e) {
                System.out.println(" Error in data input.." + e);
                System.out.println(" Please try again.....");
            }
            choice = ScannerInput.askString("Do U wish to continue ?" + "\n" + "Please enter Y OR any other key to QUIT...");
        }

        if (count != 0) {
            printBill(sold, qty);
        }
        System.out.println("\n\n\n\t\t\t" + "T H A N K   Y O U " + "\n\t\t" + "P L E A S E  V I S I T  A G A I N" + "\n\n\n\n");
    }

    private static boolean isValidProductId(int id) {
        for (int i = 0; i < pid.length; i++) {
            if (pid[i] == id) {
                return true;
            }
        }
        return false;
    }

    private static void handlePurchase(int id, int[] sold, int[] qty, int count) {
        System.out.println("\t\t" + "___________________________________");
        for (int i = 0; i < pid.length; i++) {
            if (pid[i] == id) {
                System.out.println("\t\t" + "Product Name   : " + pname[i]);
                System.out.println("\t\t" + "Price          : " + price[i]);
            }
        }
        String str = ScannerInput.askString(" Do U wish to Purchase ?  : YES/NO   ");
        if (str.equalsIgnoreCase("yes")) {
            sold[count] = id;
            qty[count] = ScannerInput.askInt("\t\t\t" + "Enter Quantity  : ");
        }
    }

    private static void printBill(int[] sold, int[] qty) {
        System.out.println("\f");
        System.out.println("\n\n\n\n\n\n\n");
        dateDisplay();
        System.out.println("\t" + "______________________________________________________");
        System.out.println("\t\t" + "C A M E L  S T A T I O N E R Y  S H O P  ");
        System.out.println("\t\t" + "3/78 Camac Street , Kolkata 700012 ");
        System.out.println("\t\t" + "Tel  : (033) 2281 5612 ");
        System.out.println("\t" + "______________________________________________________");
        System.out.println("\t\t\t" + "C U S T O M E R S'  B I L L ");
        System.out.println("\t" + "______________________________________________________");
        System.out.println("      " + "Product ID" + "  " + "Product Name" + "\t\t" + "Price" + "\t" + "Qty" + "\t" + "Total");
        System.out.println("\t" + "______________________________________________________");
        double sum = 0.0; // stores the total price of sold products
        for (int i = 0; i < sold.length; i++) {
            for (int a = 0; a < pid.length; a++) {
                if (sold[i] == pid[a]) {
                    double s = price[a] * qty[i];
                    System.out.println("\t" + pid[a] + "\t" + pname[a] + "\t" + price[a] + "\t" + qty[i] + "\t" + s);
                    sum += s;
                }
            }
        }
        System.out.println("\t" + "______________________________________________________");
        System.out.println("                                           Total  : Rs." + sum);
        System.out.println("\t" + "______________________________________________________");
        System.out.println("                                    V. A. T. 12.5%: Rs." + (12.5 / 100) * sum);
        System.out.println("\t" + "______________________________________________________");
        System.out.println("                                        Net Price : Rs." + (sum + (12.5 / 100) * sum));
        System.out.println("\t" + "______________________________________________________");
        System.out.println("\t" + "Prices inclusive of all taxes");
        System.out.println("\t" + "Goods once sold cannot be taken back");
    }

    public static void menuDisplay() {
        System.out.println("\f");
        System.out.println("\t" + "______________________________________________________");
        System.out.println("\t\t" + "C A M E L  S T A T I O N E R Y  S H O P  ");
        System.out.println("\t" + "______________________________________________________");
        System.out.println("\t\t\t" + "M A S T E R   M E N U ");
        System.out.println("\t" + "______________________________________________________");
        System.out.println("\t" + "Product ID" + "\t\t" + "Product" + "\t\t\t" + "Price");
        System.out.println("\t" + "______________________________________________________");
        for (int i = 0; i < pid.length; i++) {
            System.out.println("\t" + pid[i] + "\t\t" + pname[i] + "\t\t" + price[i]);
        }
        System.out.println("\t" + "______________________________________________________");
    }

    public static void dateDisplay() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + " / " + (c.get(Calendar.MONTH) + 1) + " / " + c.get(Calendar.YEAR));
        System.out.println("");
    }
}
