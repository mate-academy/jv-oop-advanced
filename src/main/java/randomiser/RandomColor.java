package randomiser;

public class RandomColor {
    private static final int NUMBER_COLORS = 22;
    private RandomUtil randomUtil;

    public RandomColor() {
        randomUtil = new RandomUtil();
    }

    public Color getRandomColor() {
        return Color.values()[randomUtil.getRandomIndex(NUMBER_COLORS)];
    }
}
