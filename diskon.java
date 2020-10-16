// Link video:
// https://drive.google.com/file/d/1u1MpgaT6U1Rh68FCI2ipEIIKJv9RPJ83/view?usp=sharing

import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {

        while (true) {
            Scanner dataIn = new Scanner(System.in);

            double price, disc, pricePay;
            String card;

            System.out.println("Keterangan diskon:");
            System.out.println("- Dengan kartu member:");
            System.out.println("  Diskon 5% untuk total belanja lebih dari Rp 500.000,~");
            System.out.println("  Diskon 10% untuk total belanja lebih dari Rp 1.000.000,~");
            System.out.println("- Tanpa kartu member:");
            System.out.println("  Diskon 2.5% untuk total belanja lebih dari Rp 500.000,~");
            System.out.println(" ");

            System.out.print("Apakah mempunyai kartu member ?: ");
            card = dataIn.nextLine();
            System.out.print("Total belanja: ");
            price = dataIn.nextDouble();

            if (card.equalsIgnoreCase("ya")) {
                if (price > 1000000) {
                    disc = 0.1 * price;
                } else if (price > 500000) {
                    disc = 0.05 * price;
                } else {
                    disc = 0;
                }
            } else {
                if (price > 500000) {
                    disc = 0.025 * price;
                } else {
                    disc = 0;
                }
            }

            pricePay = price - disc;

            System.out.println("Total belanja setelah diskon: Rp " + pricePay);
            System.out.println(" ");
        }
    }
}
