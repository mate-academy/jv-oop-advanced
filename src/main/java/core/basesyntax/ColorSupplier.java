package core.basesyntax;

import java.util.Random;

public class ColorSupplier implements Draw, Figure {
    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }

    public enum Color {
        Green,
        Yellow,
        Blue,
        Pink,
        Black,
        White,
        Purple
    }

}
