import java.util.*;
public class stateTaxes {
    public stateTaxes() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a State Abreviation (e.g. CA): " );
        String stateName = input.nextLine();
        switch (stateName) {
            case "AL" -> {final double tax = 0.04; }//Alabama
            case "AK" -> {final double tax = 0.00;} //Alaska
            case "AZ" -> {final double AZ = 0.056;} //Arizona
            case "AR" -> {final double AR = 0.065;} //Arkansas
            case "CA" -> {final double CA = 0.0725;} //California
            case "CO" -> {final double CO = 0.029;} //Colorado
            case "CT" -> {final double CT = 0.0635;} //Connecticut
            case "DE" -> {final double DE = 0.00;} //Delaware
            case "DC" -> {final double DC = 0.06;} //District of Columbia
            case "FL" -> {final double FL = 0.06;} //Florida
            case "GA" -> {final double GA = 0.04;} //Georgia
            case "HI" -> {final double HI = 0.04;} //Hawaii
            case "ID" -> {final double ID = 0.06;} //Idaho
            case "IL" -> {final double IL = 0.0625;} //Illinois
            case "IN" -> {final double IN = 0.07;} //Indiana
            case "IA" -> {final double IA = 0.06;} //Iowa
            case "KS" -> {final double KS = 0.065;} //Kansas
            case "KY" -> {final double KY = 0.06;} //Kentucky
            case "LA" -> {final double LA = 0.0445;} //Louisiana
            case "ME" -> {final double ME = 0.055;} //Maine
            case "MD" -> {final double MD = 0.06;} //Maryland
            case "MA" -> {final double MA = 0.0625;} //Massachusetts
            case "MI" -> {final double MI = 0.06;} //Michigan
            case "MN" -> {final double MN = 0.0688;} //Minnesota
            case "MS" -> {final double MS = 0.07;} //Mississippi
            case "MO" -> {final double MO = 0.0423;} //Missouri
            case "MT" -> {final double MT = 0.00;} //Montana
            case "NE" -> {final double NE = 0.055;} //Nebraska
            case "NV" -> {final double NV = 0.0685;} //Nevada
            case "NH" -> {final double NH = 0.00;} //New Hampshire
            case "NJ" -> {final double NJ = 0.0663;} //New Jersey
            case "NM" -> {final double NM = 0.0513;} //New Mexico
            case "NY" -> {final double NY = 0.04;} //New York
            case "NC" -> {final double NC = 0.0475;} //North Carolina
            case "ND" -> {final double ND = 0.05;} //North Dakota
            case "OH" -> {final double OH = 0.0575;} //Ohio
            case "OK" -> {final double OK = 0.045;} //Oklahoma
            case "OR" -> {final double OR = 0.00;} //Oregon
            case "PA" -> {final double PA = 0.06;} //Pennsylvania
            case "RI" -> {final double RI = 0.07;} //Rhode Island
            case "SC" -> {final double SC = 0.06;} //South Carolina
            case "SD" -> {final double SD = 0.045;} // South Dakota
            case "TN" -> {final double TN = 0.07;} //Tennessee
            case "TX" -> {final double TX = 0.0625;} //Texas
            case "UT" -> {final double UT = 0.061;} //Utah
            case "VT" -> {final double VT = 0.06;} //Vermont
            case "VA" -> {final double VA = 0.053;} //Virginia
            case "WA" -> {final double WA = 0.065;} //Washington
            case "WV" -> {final double WV = 0.06;} //West Virginia
            case "WI" -> {final double WI = 0.05;} //Wisconsin
            case "WY" -> {final double WY = 0.04;} //Wyoming


        }
    }
}



