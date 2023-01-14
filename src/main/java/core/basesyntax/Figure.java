package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Area {
    public Color color;
    public Figure (Color color) {
        this.color = color;
    }
    public static final int Max_Value = 25;
    private static final Random random = new Random();
    public Random getRandom() {
        return random;
    }
}
