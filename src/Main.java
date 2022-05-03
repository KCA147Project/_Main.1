import java.time.format.*;
import java.util.*;
import java.text.*;
import java.time.*;


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
        //NUMBERS CLASS
        double Maryland = 0.06;
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
        System.out.print("\nWhat state are you from?: ");
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

        System.out.println("Atkinson Shields Stein & Partners");
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

