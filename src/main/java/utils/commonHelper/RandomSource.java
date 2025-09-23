package utils.commonHelper;

import com.github.javafaker.Faker;

public class RandomSource {
    static Faker faker = new Faker();

    private RandomSource() {}   // Private Constructor to stop instantiation

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateRandomPassword() {
        return faker.internet().password();
    }

    public static String generateRandomName() {
        return faker.name().fullName();
    }

    public static String generateRandomMobileNumber() {
        String[] prefix = {"010", "011", "012", "015"};
        String postfix = faker.numerify("########");
        int randomIndex = faker.random().nextInt(prefix.length);
        return (prefix[randomIndex] + postfix);
    }

    public static String generateRandomAddress() {
        return faker.address().fullAddress();
    }

    public static String generateRandomCity() {
        return faker.address().city();
    }

    public static String generateRandomZipcode() {
        return faker.address().zipCode();
    }
}
