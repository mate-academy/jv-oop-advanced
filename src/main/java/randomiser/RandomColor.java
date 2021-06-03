package randomiser;

import java.util.Random;

public class RandomColor {
    private static final Random rnd = new Random();
    private static final int NUMBER_OF_COLORS = 24;
    private static final int NUMBER_OF_FIGURES = 5;

    public static Color getRandomColor() {
        int randomIndex = getRandomIndex();
        return Color.values()[randomIndex];
    }

    public static int getRandomIndex() {
        return rnd.nextInt(NUMBER_OF_FIGURES);
    }
}

