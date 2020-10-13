public class Password {

    public static void main(String[] args) {

        String password = "correcthorsebatterystaple";
        String wrongPassword = "thisiswrong";
        String correctPassword = "correcthorsebatterystaple";
        // Write the code:
        System.out.println(password.equals(wrongPassword));
        System.out.println(password.equals(correctPassword));
    }

}