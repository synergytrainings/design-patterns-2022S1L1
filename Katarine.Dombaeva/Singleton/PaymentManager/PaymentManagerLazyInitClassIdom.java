public class PaymentManagerLazyInitClassIdom {

    private PaymentManagerLazyInitClassIdom() {
    }

    private static class InitInnerClass {
        private static PaymentManagerLazyInitClassIdom instance = new PaymentManagerLazyInitClassIdom();
    }

    public static PaymentManagerLazyInitClassIdom getInstance() {
        return InitInnerClass.instance;
    }

    public void makeTransaction(String transactionId) {

    }
}
