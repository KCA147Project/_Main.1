import java.util.*;

public class Statetaxes {

    double Statetaxes() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a State Abbreviation (e.g. CA): " );
        String stateName = input.nextLine();
        double tax = 0.00;
        switch (stateName) {
            case "AL" -> {tax = 0.04; }//Alabama
            case "AK" -> {tax = 0.00;} //Alaska
            case "AZ" -> {tax = 0.056;} //Arizona
            case "AR" -> {tax = 0.065;} //Arkansas
            case "CA" -> {tax = 0.0725;} //California
            case "CO" -> {tax = 0.029;} //Colorado
            case "CT" -> {tax = 0.0635;} //Connecticut
            case "DE" -> {tax = 0.00;} //Delaware
            case "DC" -> {tax = 0.06;} //District of Columbia
            case "FL" -> {tax = 0.06;} //Florida
            case "GA" -> {tax = 0.04;} //Georgia
            case "HI" -> {tax = 0.04;} //Hawaii
            case "ID" -> {tax = 0.06;} //Idaho
            case "IL" -> {tax = 0.0625;} //Illinois
            case "IN" -> {tax = 0.07;} //Indiana
            case "IA" -> {tax = 0.06;} //Iowa
            case "KS" -> {tax = 0.065;} //Kansas
            case "KY" -> {tax = 0.06;} //Kentucky
            case "LA" -> {tax = 0.0445;} //Louisiana
            case "ME" -> {tax = 0.055;} //Maine
            case "MD" -> {tax = 0.06;} //Maryland
            case "MA" -> {tax = 0.0625;} //Massachusetts
            case "MI" -> {tax = 0.06;} //Michigan
            case "MN" -> {tax= 0.0688;} //Minnesota
            case "MS" -> {tax = 0.07;} //Mississippi
            case "MO" -> {tax = 0.0423;} //Missouri
            case "MT" -> {tax = 0.00;} //Montana
            case "NE" -> {tax = 0.055;} //Nebraska
            case "NV" -> {tax = 0.0685;} //Nevada
            case "NH" -> {tax = 0.00;} //New Hampshire
            case "NJ" -> {tax = 0.0663;} //New Jersey
            case "NM" -> {tax = 0.0513;} //New Mexico
            case "NY" -> {tax = 0.04;} //New York
            case "NC" -> {tax = 0.0475;} //North Carolina
            case "ND" -> {tax = 0.05;} //North Dakota
            case "OH" -> {tax = 0.0575;} //Ohio
            case "OK" -> {tax = 0.045;} //Oklahoma
            case "OR" -> {tax = 0.00;} //Oregon
            case "PA" -> {tax = 0.06;} //Pennsylvania
            case "RI" -> {tax = 0.07;} //Rhode Island
            case "SC" -> {tax = 0.06;} //South Carolina
            case "SD" -> {tax = 0.045;} // South Dakota
            case "TN" -> {tax = 0.07;} //Tennessee
            case "TX" -> {tax = 0.0625;} //Texas
            case "UT" -> {tax = 0.061;} //Utah
            case "VT" -> {tax = 0.06;} //Vermont
            case "VA" -> {tax = 0.053;} //Virginia
            case "WA" -> {tax = 0.065;} //Washington
            case "WV" -> {tax= 0.06;} //West Virginia
            case "WI" -> {tax = 0.05;} //Wisconsin
            case "WY" -> {tax = 0.04;} //Wyoming


        }
        return tax;

    }
    }




