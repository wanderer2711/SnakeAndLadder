public class SnakeAndLadder {
    public static final int position1 = 0;
    public static void main (String[] args) {
        // --> Generating Random number between desired range.
        // Min value + (int)(Math.random() * ((Max - Min) + 1))
        int dice = 1 + (int)(Math.random() * ((6 - 1) + 1));
        System.out.println(dice);
    }
}