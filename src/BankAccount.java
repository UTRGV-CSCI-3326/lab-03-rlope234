
public class BankAccount{
    public static void main(String[] args) {
        float start = 2175.37f; // starting balance
        float withdrew = start - 50.03f;
        float part3 = (withdrew / 2) + 20.00f;
        float part4 = part3 - 1f;
        float part5 = part4 * 2f;
        float part6 = part5 + 1f;

        
        System.out.println("Bob's new balance after all transaction: " + part6);
    }
}