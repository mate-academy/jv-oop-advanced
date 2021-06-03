package randomiser;

public class RandomColor {
    private RandomUtil randomUtil;

    public RandomColor() {
        randomUtil = new RandomUtil();
    }

    public Color getRandomColor() {
        return Color.values()
            [randomUtil.getRandomIndex(Color.values().length)];
    }
}
