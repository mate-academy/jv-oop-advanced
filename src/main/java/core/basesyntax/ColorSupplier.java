package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public enum Color {
        YELLOW,
        RED,
        BLUE,
        GREEN,
        BLACK,
        GREY,
        WHITE
    }

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.toString().toLowerCase();
    }
}
