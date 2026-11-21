package day19;

public class ScopedValuesDemo {

    private static final ScopedValue<String> USER =
            ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.where(USER, "Sam").run(() -> {
            displayUser();
        });
    }

    private static void displayUser() {
        System.out.println("Current user: " + USER.get());
    }
}