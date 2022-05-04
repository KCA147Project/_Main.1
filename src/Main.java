import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;


public class Main {



    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

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
        double itemPrice[];

        itemPrice = new double [30];

        itemPrice[0]=799.00;
        itemPrice[1]=1599.00;
        itemPrice[2]=547.80;
        itemPrice[3]=499.00;
        itemPrice[4]=5715.00;
        itemPrice[5]=6099.00;
        itemPrice[6]=549.00;
        itemPrice[7]=529.00;
        itemPrice[8]=1699.00;
        itemPrice[9]=2399.00;
        itemPrice[10]=39.99;
        itemPrice[11]=40.98;
        itemPrice[12]=35.99;
        itemPrice[13]=39.97;
        itemPrice[14]=138.99;
        itemPrice[15]=35.95;
        itemPrice[16]=89.99;
        itemPrice[17]=121.63;
        itemPrice[18]=412.00;
        itemPrice[19]=59.99;
        itemPrice[20]=99.00;
        itemPrice[21]=39.95;
        itemPrice[22]=5.99;
        itemPrice[23]=55.98;
        itemPrice[24]=32.39;
        itemPrice[25]=13.80;
        itemPrice[26]=21.99;
        itemPrice[27]=10.34;
        itemPrice[28]=76990.00;
        itemPrice[29]=599.00;


//_____________________________________________________________________________________________________________________
        //NUMBERS CLASS
        double Maryland= 0.06;
        int numberPurchase;
        byte numberQuantity, employeeId;
        double subtotal, tax, totalCost;

        Scanner scan = new Scanner (System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance ();
        NumberFormat fmt2 = NumberFormat.getPercentInstance ();
//_____________________________________________________________________________________________________________________

        //System.out.println ("-----------------------------------------------------------");

        //NAME (QUESTION)
        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat state are you from? (Abbreviate e.g. CA): ");
        String value = input.nextLine();

        //EMPLOYEE ID
        //System.out.print ("Employee ID: ");
        //employeeId = scan.nextByte();

        //HOURS WORKED
        System.out.print ("What did you PURCHASE?: ");
        numberPurchase = scan.nextInt();

        //HOURLY RATE
        System.out.print ("What is your QUANTITY?: ");
        numberQuantity = scan.nextByte();

        subtotal = numberPurchase * numberQuantity;
        tax = subtotal * Maryland;
        totalCost = subtotal + tax;


//_____________________________________________________________________________________________________________________
        //OUTPUT
        System.out.println ("\n**************************************");

        System.out.println("Atkinson Shields Stine & Partners");
        System.out.println("Store # 09254");
        System.out.println("1000 Hilltop Cir,\nBaltimore, MD 21250" + " (410) 455-1000");
        System.out.println(dtf.format(now) /*+ employeeId*/);
        //System.out.println("\n");

        System.out.println ("\nState: " + value); //STATE
        System.out.printf ("State Tax: " + "%.2f%%\n", Maryland); //STATE TAX
        System.out.println("\n" + tableHeader.get(0) + " | " + tableHeader.get(1) + " | " + tableHeader.get(2)+ " | " + tableHeader.get(3));
        System.out.println("____" +  "   " + "___" +  "   " + "_____" +  "   " + "_____");




        System.out.println ("The AMOUNT: " + fmt1.format(numberPurchase)); //HOUR WORKED

        System.out.println ("QUANTITY: " +numberQuantity); //PAY RATE PER HOUR

        System.out.println ("Sub Total:         " + fmt1.format (subtotal)); //GROSS PAY

        System.out.println ("Tax Paid:          " + fmt1.format (tax)); //TAX PAID

        System.out.println ("Total:             " + fmt1.format (totalCost)); //NET PAY

        System.out.println ("**************************************");

        System.out.println(itemList.get(0) + "       " + fmt1.format(itemPrice[0]));
        System.out.println(itemList.get(18) + "       " + fmt1.format(itemPrice[18]));





    }
}

