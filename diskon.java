import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {

        while (true){
            Scanner dataIn = new Scanner(System.in);

            double price, disc, pricePay;
            String card;

            System.out.print("Apakah mempunyai kartu member ?: ");
            card = dataIn.nextLine();
            System.out.print("Total belanja: ");
            price = dataIn.nextDouble();

            if (card.equalsIgnoreCase("ya")) {
                if (price > 1000000){
                    disc = 0.1 * price;
                } else if (price > 500000){
                    disc = 0.05 * price;
                } else {
                    disc = 0;
                }
            } else {
                if (price > 500000){
                    disc = 0.025 * price;
                } else {
                    disc = 0;
                }
            }

            pricePay = price - disc;

            System.out.println("Total belanja setelah diskon: Rp "+ pricePay);
            System.out.println(" ");
        }
    }
}
