public class PaymentManagerStaticBlockInit {

    private static PaymentManagerStaticBlockInit instance = null;

    private PaymentManagerStaticBlockInit() {
    }

    static {
        try {
            instance = new PaymentManagerStaticBlockInit();
        } catch (Exception e) {
            throw new RuntimeException("Exception while creating Payment Manager instance");
        }
    }

    public static PaymentManagerStaticBlockInit getInstance() {
        return instance;
    }

    public void makeTransaction(String transactionId) {

    }
}
