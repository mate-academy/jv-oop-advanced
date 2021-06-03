package randomiser;

import java.util.Random;

public class RandomColor {
    private static final Random rnd = new Random();

    public static Color getRandomColor() {
        int randomIndex = rnd.nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }
}

