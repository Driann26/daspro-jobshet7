import java.util.Scanner;

public class CinemaTicketSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTickets = 0;
        double totalSales = 0;
        final int PRICE_PER_TICKET = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (negatif untuk keluar): ");
            int jumlah = scanner.nextInt();

            if (jumlah < 0) {
                break; // Exit the loop
            }

            if (jumlah == 0) {
                continue; // Ignore zero input
            }

            double discount = 0;
            if (jumlah > 10) {
                discount = 0.15;
            } else if (jumlah > 4) {
                discount = 0.10;
            }

            double subtotal = jumlah * PRICE_PER_TICKET;
            subtotal -= subtotal * discount;

            totalTickets += jumlah;
            totalSales += subtotal;
        }

        System.out.println("Total tiket terjual: " + totalTickets);
        System.out.println("Total penjualan: Rp " + totalSales);
        sc.close();   
    }
}
