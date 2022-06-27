public class User {
    private static int REGULAR_ID = 0;
    private int id;
    private String firstName;
    private String lastName;

    private User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static User createUserWithId(int id, String firstName, String lastName) {
        // some validations
        return new User(id, firstName, lastName);
    }


    public static User createRegular(String firstName, String lastName) {
        return new User(REGULAR_ID++, firstName, lastName);
    }

    public static User createUserFromSmith(String firstName) {
        return new User(REGULAR_ID++, firstName, "Smith");
    }
}
