public class PaymentManagerEagerInit {

    private static final PaymentManagerEagerInit instance = new PaymentManagerEagerInit();

    private PaymentManagerEagerInit() {
    }

    public static PaymentManagerEagerInit getInstance() {
        return instance;
    }

    public void makeTransaction(String transactionId) {

    }

}
