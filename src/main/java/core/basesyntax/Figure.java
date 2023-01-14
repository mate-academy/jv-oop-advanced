package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Area {

    public static final int Max_Value = 25;
    private static final Random random = new Random();
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Random getRandom() {
        return random;
    }
}
