public class User {
    private String firstName;
    private String lastName;
    private Card card;

    public User(String firstName, String lastName, Card card) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = card;
    }

    public addToCard(String item) {
        this.card.addItem();
    }

    public void purchase() {
        // call getInstance().makeTransaction(String transactionId) on any PaymentManager class
    }
}
