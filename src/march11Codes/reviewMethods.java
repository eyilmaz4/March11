package march11Codes;

public class reviewMethods {
    public static void main(String[] args) {
        parkFee(true, 12);
    }

    public static void parkFee(Boolean member, int hour) {
        int payment=0;
        if (member) {
            System.out.println("no charge");;
        } else {
            if (hour >= 1 && hour <= 2) {
                payment = 3;
            } else if (hour >= 3 && hour <= 6) {
                payment = 5;
            } else if (hour >= 7 && hour <= 12) {
                payment = 10;
            } else if (hour > 12) {
                payment = 15;
            }

        }System.out.println("your parking fee is: $"+payment);
    }

}
