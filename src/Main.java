public class Main {
    public static void main(String[] args) {
        double degrees = 90.0;
        double answer = Math.sin(degrees);
        System.out.println(answer);

        double value = 1234.567;
        long wholeNumber = Math.round(value); // round up if fraction is  0.5 or greater (round)
        System.out.println(wholeNumber);
        System.out.println(Math.ceil(value)); // round up  no matter what (ceil)
        System.out.println(Math.floor(value)); // round down no matter what (floor)

    }
}