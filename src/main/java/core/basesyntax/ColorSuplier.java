package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private Random randomColor = new Random();

    public Color getRandomColor() {
        int index = randomColor.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
