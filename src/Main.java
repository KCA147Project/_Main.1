import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;



public class Main {



    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy | HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String line = new String(new char[48]).replace('\0', '_');
        String line2 = new String(new char[48]).replace('\0', '*');

//_____________________________________________________________________________________________________________________
        //ADDRESS CLASS

        String number;


//_____________________________________________________________________________________________________________________
        //ARRAY HEADER CLASS


        ArrayList<String> tableHeader = new ArrayList();
        tableHeader.add("ITEM"); //0
        tableHeader.add("QTY"); //1
        tableHeader.add("PRICE"); //2
        tableHeader.add("TOTAL"); //3


//_____________________________________________________________________________________________________________________
        //ARRAY ITEM NAME CLASS

        ArrayList<String> itemList = new ArrayList();
        itemList.add("EGO 56-volt Select Cut"); //0
        itemList.add("iPhone 13 Pro Max (1TB)"); //1
        itemList.add("T-Rex Skull"); //2
        itemList.add("Playstation V"); //3
        itemList.add("TAG Heuer Monaco Calibre 11"); //4
        itemList.add ("MacBook Pro 16-inch"); //5
        itemList.add("Airpods Max"); //6
        itemList.add("Samsung 65-inch 4K Smart TV"); //7
        itemList.add("Milwaukee Brushless Combo"); //8
        itemList.add("iPad Pro 12.9-inch (2TB)"); //9
        itemList.add("NexiGo Webcam"); //10
        itemList.add("Blurams Security Camera"); //11
        itemList.add("Occer 12x25 Compact Binoculars"); //12
        itemList.add("TOPS Opening Day Baseball Value Pack"); //13
        itemList.add("Retro Typewriter Keyboard 7 Keys"); //14
        itemList.add("Hydro Flask"); //15
        itemList.add("Auking Mini Projector"); //16
        itemList.add("Nike Tech Jacket"); //17
        itemList.add("Yeezy Boost 350v2 Bred"); //18
        itemList.add("Elden Ring"); //19
        itemList.add("Comfort Carry Portable Locker Pack, 42L"); //20
        itemList.add("AquaSonic Black Series"); //21
        itemList.add("Crest Pro-Health"); //22
        itemList.add("Blue Buffalo Life Protection"); //23
        itemList.add("WEWLINE 17-inch Toolbox"); //24
        itemList.add("BIC Xtra-Smooth Mechanical Pencils"); //25
        itemList.add("3 Pack Chargers (AppleMFi Certified)"); //26
        itemList.add("Amazon Basics Small Digital Alarm Clock"); //27
        itemList.add("Tesla Model 3 Performance"); //28
        itemList.add("Meepo V3 Electric Skateboard"); //29

//_____________________________________________________________________________________________________________________
        //ARRAY ITEM PRICE CLASS

        //ArrayList<String>itemPrice = new ArrayList();
        double [] itemprice = Price.itemPrice();


//_____________________________________________________________________________________________________________________
        //NUMBERS CLASS
        double Maryland= 0.06;
        new stateTaxes();
        int numberPurchase, num1,num2,num3,num4,num5,num6;
        byte numberQuantity, employeeId;
        double subtotal, tax, totalCost;


        Scanner scan = new Scanner (System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance ();
        NumberFormat fmt2 = NumberFormat.getPercentInstance ();
//_____________________________________________________________________________________________________________________


        //NAME (QUESTION)
        Scanner input = new Scanner(System.in);

       System.out.println("\nWhat state are you from? (Abbreviate e.g. CA): ");
        String value = input.nextLine();

        //EMPLOYEE ID
        //System.out.print ("Employee ID: ");
        //employeeId = scan.nextByte();

        //SIX ITEMS
        System.out.print ("What did you PURCHASE?: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();
        num6 = scan.nextInt();


        //QUANTITY
        System.out.print ("What is your QUANTITY?: ");
        numberQuantity = scan.nextByte();

        numberPurchase = (num1+num2+num3+num4+num5+num6);
        subtotal = numberPurchase * numberQuantity;
        tax = subtotal * Maryland;
        totalCost = subtotal + tax;

       //String yea = tax;




//_____________________________________________________________________________________________________________________
        //OUTPUT
        System.out.println ("\n" + line2);

        System.out.println("              Atkinson Shields \n              Stine & Partners");
        System.out.println("\n               Store # 094254");
        System.out.println("       1000 Hilltop Cir ITE Building \n     Baltimore MD 21250" + " (410) 455-1000");
        System.out.println(dtf.format(now) +" | " + "EMPLOYEE ID: 223296" /*+ create employeeId*/);
        //System.out.println("\n");

        System.out.println ("\nState: " + value.toUpperCase()); //STATE
        System.out.printf ("State Tax: " + "%.2f%%\n", Maryland); //STATE TAX

        System.out.println ("\n" + line);
        System.out.println(tableHeader.get(0) + "  |  " + tableHeader.get(1) + "  |  " + tableHeader.get(2)+ "  |  " + tableHeader.get(3));
        System.out.println("====" +  "     " + "===" +  "     " + "=====" +  "     " + "=====");



        System.out.println ("AMOUNT: " + fmt1.format(numberPurchase)); //AMOUNT

        System.out.println ("Sub Total:         " + fmt1.format (subtotal)); //SUBTOTAL

        System.out.println ("Tax Paid:          " + fmt1.format (tax)); //TAX PAID

        System.out.println ("Total:             " + fmt1.format (totalCost)); //TOTAL WITH TAX CALCULATED

        System.out.println (line);

        System.out.println(itemList.get(0) + "       " + fmt1.format(itemprice[0]));
        System.out.println(itemList.get(18) + "       " + fmt1.format(itemprice[18]));







    }
}

