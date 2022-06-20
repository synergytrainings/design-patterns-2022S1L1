public class PaymentManagerSyncBlockInit {

    private volatile static PaymentManagerSyncBlockInit instance = null;

    private PaymentManagerSyncBlockInit() {
    }

    public PaymentManagerSyncBlockInit getInstance() {
        if (instance == null) {
            synchronized (PaymentManagerSyncBlockInit.class) {
                if (instance == null) {
                    instance = new PaymentManagerSyncBlockInit();
                }
            }
        }
        return instance;
    }

    public void makeTransaction(String transactionId) {

    }
}

// questions - https://www.journaldev.com/171/thread-safety-in-java-singleton-classes && https://learning.oreilly.com/library/view/effective-java/9780134686097/ch11.xhtml#lev84
// 1. About mutex object
// 2. How is variable result improving performance
