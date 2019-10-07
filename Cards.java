import java.util.Scanner;

public class Cards {

    private static final String ACE = "ace";
    private static final String ONE = "one";
    private static final String TWO = "two";
    private static final String THREE = "three";
    private static final String FOUR = "four";
    private static final String FIVE = "five";
    private static final String SIX = "six";
    private static final String SEVEN = "seven";
    private static final String EIGHT = "eight";
    private static final String NINE = "nine";
    private static final String TEN = "ten";
    private static final String JACK = "jack";
    private static final String QUEEN= "queen";
    private static final String KING = "king";


    public static void main(String[] args) {
        String[][] set = new String[2][13];
        set[0][0] = ACE;
        set[0][1] = ONE;
        set[0][2] = TWO;
        set[0][3] = FOUR;
        set[0][4] = FIVE;
        set[0][5] = SIX;
        set[0][6] = SEVEN;
        set[0][7] = EIGHT;
        set[0][8] = NINE;
        set[0][9] = TEN;
        set[0][10] = JACK;
        set[0][11] = QUEEN;
        set[0][12] = KING;
        set[1][0] = NINE;
        set[1][1] = FIVE;
        set[1][2] = ACE;
        set[1][3] = EIGHT;
        set[1][4] = JACK;
        set[1][5] = SEVEN;
        set[1][6] = TEN;
        set[1][7] = KING;
        set[1][8] = THREE;
        set[1][9] = QUEEN;
        set[1][10] = SIX;
        set[1][11] = FOUR;
        set[1][12] = TWO;
        Scanner scanner = new Scanner(System.in);

        boolean go = true;
        String s = "rann";
        int score = 0;
        int tries = 0;
        while (go) {
            boolean fir = true;
            int first = 0;
            int second = 0;

            System.out.println("Select a Card");
            System.out.print("Select a number from 0 to 12");
            try {
                first = scanner.nextInt()%13;
            }catch (Exception e) {
                first = 0;
            }
            while ((first != (int)first)){
                System.out.println("Try again");
                System.out.print("Select a number from 0 to 12");
                first = scanner.nextInt()%13;
            }

            System.out.println("Select a Card");
            System.out.print("Select a number from 0 to 12");
            try {
                second = scanner.nextInt()%13;
            }catch (Exception e) {
                second = 0;
            }
            while ((second != (int)second)){
                System.out.println("Try again");
                System.out.print("Select a number from 0 to 12");
                try {
                    second = scanner.nextInt()%13;
                }catch (Exception e) {
                    continue;
                }
            }
            if (set[0][first].equals(set[1][second]) && !(set[0][first].equals("selected"))) {
                score++;
                tries++;
                System.out.println("first : " + set[0][first]);
                System.out.println("second : " + set[1][second]);
                set[0][first] = "selected";
                set[1][second] = "selected";
                System.out.println("score : " + score + "; tries : " + tries);
            }
            else {
                tries++;
                System.out.println("first : " + set[0][first]);
                System.out.println("second : " + set[1][second]);
                System.out.println("Failed");
                System.out.println("score : " + score + "; tries : " + tries);
            }
            if (score == 13) {
                System.out.println("You win!");
                break;
            }
            System.out.println("keep going?");
            System.out.println("0 to go again and 1 to stop");
            int keep = 10;
            try {
                keep = scanner.nextInt();
            }
            catch (Exception e) {

            }
            if (keep == 0) {
                go = true;
            }
            else if(keep == 1) {
                go = false;
            }
            else {
                while (keep != 0 && keep != 1) {
                    System.out.println("0 to go again and 1 to stop");
                    try {
                        keep = scanner.nextInt();
                    }
                    catch (Exception e) {
                        keep = 0;
                    }
                }
            }

        }

    }

}
