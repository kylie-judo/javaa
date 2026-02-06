public class smartphone {
    int batteryLevel;

    // CONSTRUCTOR: This runs automatically when you use 'new'
    public smartphone() {
        batteryLevel = 100;
    }

    public static void main(String[] args) {
        // Create the object
        smartphone myPhone = new smartphone();

        // Print the result to prove the constructor worked
        System.out.println("Phone battery is at: " + myPhone.batteryLevel + "%");
    }
}