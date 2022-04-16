package day47_encapsulation;
import java.util.Arrays;
import java.util.stream.Stream;


public class DebitCard {


        //instance variables
        long cardNumber;
        String holderName;
        String cardType;
        int pin;
        double balance;

        //static variables
        static String accountType;

        static {
            System.out.println("Static block is running");
            accountType = "Checking";
        }

        //this is the reference of the objects

    public DebitCard(long cardNumber, String holderName,double balance){
            this.holderName = holderName;
            this.balance = balance;

            if (String.valueOf(cardNumber).length() == 16){
                this.cardNumber = cardNumber;
            }else{
                System.out.println("Invalid card number");//    err makes the output red
            }

        }
    public DebitCard(long cardNumber, String holderName, String cardType,int pin, double balance){
            this(cardNumber, holderName, balance);

            if (cardType.equalsIgnoreCase("vise")||cardType.equalsIgnoreCase("mastercard")){
                this.cardType=cardType;
            }else {
                System.out.println("Invalid card type - Must be Vise or MasterCard");
            }

            if (String.valueOf(pin).length()==4){
                this.pin=pin;
            }else {
                System.out.println("Invalid Pin - Must be 4 digits");
            }
        }
        public String toString(){

            String info = "Holder name: " + holderName;
            if (cardNumber != 0){
                info += "\nCard Number: " + cardNumber;
            }
            if (cardType != null){
                info += "\nCard type: " + cardType;
            }
            info += "\nBalance: "+balance;
            return info;

        }
    }
