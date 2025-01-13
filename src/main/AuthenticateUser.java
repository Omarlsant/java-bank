public class Main {
    int pin = 1234;
}

public boolean authenticateUser(String inputPin) {
    int attempts = 0;
    while (attempts < 3) {
        if (this.pin.equals(inputPin)) {
            return true;
        } else {
            attempts++;
            System.out.println("Incorrect PIN. Please try again." + attempts + "/3");
        }
    }
    return false;
}