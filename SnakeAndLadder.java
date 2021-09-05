public class SnakeAndLadder {
//    public static final int position1 = 0;
    public static final int NoPlay = 1;
    public static final int Ladder = 2;
    public static final int Snake = 3;
    public static void main (String[] args) {
        // --> Generating Random number between desired range.
        // Min value + (int)(Math.random() * ((Max - Min) + 1))
        int position1 = 0;
        while (position1 < 100) {
            int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int options = 1 + (int) (Math.random() * ((3 - 1) + 1));
//            System.out.println(dice);
//            System.out.println(options);
            switch (options) {
                case 1:
                    break;
                case 2:
                    position1 += dice;
                    break;
                case 3:
                    position1 -= dice;
            }

        }
        System.out.println(position1);
    }
}