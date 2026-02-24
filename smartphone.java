public class smartphone {
    int batteryLevel;

    // CONSTRUCTOR: This runs auto  matically when you use 'new'
    public smartphone() {
        batteryLevel = 70;
    }

    public static void main(String[] args) {
        // Create the object
        smartphone myPhone = new smartphone();

        // Print the result to prove the constructor worked
        System.out.println("Phone battery is a  t: " + myPhone.batteryLevel + "%");
    }
}