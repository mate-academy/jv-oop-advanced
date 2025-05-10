package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier implements FigureDraw {
    private String color;

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
