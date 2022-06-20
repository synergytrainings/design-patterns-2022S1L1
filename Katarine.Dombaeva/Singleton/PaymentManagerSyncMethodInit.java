public class PaymentManagerSyncMethodInit {

    private static PaymentManagerSyncMethodInit instance = null;

    private PaymentManagerSyncMethodInit() {
    }

    public static synchronized PaymentManagerSyncMethodInit getInstance() {
        if (instance == null) {
            instance = new PaymentManagerSyncMethodInit();
        }
        return instance;
    }

    public void makeTransaction(String transactionId) {

    }
}
