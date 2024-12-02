public class Main {
    public static void main(String[] args) {

        String[] numbers = {"10", "20", "30", null, "50"};
        for (String number : numbers) {

                int result = Integer.parseInt(number);
                System.out.println(result);

        }
    }
}