import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;


public class Main {



    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

//_____________________________________________________________________________________________________________________
        //WORKER ID CLASS



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
        itemList.add("electricLawnMower"); //0
        itemList.add("iPhone"); //1
        itemList.add("dinoSkull"); //2
        itemList.add("gameConsole"); //3
        itemList.add("automaticWatch"); //4
        itemList.add ("Laptop"); //5
        itemList.add("airPodmax"); //6
        itemList.add("smartTv"); //7
        itemList.add("toolSet"); //8
        itemList.add("tablet"); //9
        itemList.add("webcam"); //10
        itemList.add("securityCamera"); //11
        itemList.add("binoculars"); //12
        itemList.add("baseballCards"); //13
        itemList.add("typeWriter"); //14
        itemList.add("waterBottle"); //15
        itemList.add("projector"); //16
        itemList.add("jacket"); //17
        itemList.add("yeezyShoes"); //18
        itemList.add("videoGame"); //19
        itemList.add("backpack"); //20
        itemList.add("toothbrush"); //21
        itemList.add("toothPaste"); //22
        itemList.add("dogFood"); //23
        itemList.add("toolBox"); //24
        itemList.add("mechanicalPencils"); //25
        itemList.add("iphoneCharger"); //26
        itemList.add("alarmClock"); //27
        itemList.add("teslaModel3"); //28
        itemList.add("electricSkateboard"); //29

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

        System.out.print("\nWhat state are you from?(Enter Abreviation. e.g. CA): ");
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
        System.out.println("____" +  "   " + "___" +  "   " + "____" +  "  " + "____");




        System.out.println ("The AMOUNT: " + fmt1.format(numberPurchase)); //HOUR WORKED

        System.out.println ("QUANTITY: " +numberQuantity); //PAY RATE PER HOUR

        System.out.println ("Sub Total:         " + fmt1.format (subtotal)); //GROSS PAY

        System.out.println ("Tax Paid:          " + fmt1.format (tax)); //TAX PAID

        System.out.println ("Total:             " + fmt1.format (totalCost)); //NET PAY

        System.out.println ("**************************************");


    }
}

