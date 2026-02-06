public class calc {

    // 1. This is the METHOD (The Reusable Calculator)
    // It is defined OUTSIDE of main, but inside the Class
    public static double calculateSalesTax(double price, double taxRate) {
        return price * taxRate; // Returns the math result to whoever called it
    }

    public static void main(String[] args) {
        // 2. Data for different transactions
        double laptopPrice = 1200.00;
        double headphonesPrice = 150.00;
        double currentTax = 0.07; // 7% tax

        // 3. Using the method for Transaction #1
        double taxForLaptop = calculateSalesTax(laptopPrice, currentTax);
        double totalLaptop = laptopPrice + taxForLaptop;

        // 4. Using the same method for Transaction #2 (Reusability!)
        double taxForHeadphones = calculateSalesTax(headphonesPrice, currentTax);
        double totalHeadphones = headphonesPrice + taxForHeadphones;

        // Output results
        System.out.println("Laptop Total: $" + totalLaptop);
        System.out.println("Headphones Total: $" + totalHeadphones);
    }
}
       


