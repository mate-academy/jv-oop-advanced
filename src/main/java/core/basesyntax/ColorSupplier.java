package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int number = new Random().nextInt(FigureColor.values().length);
        return String.valueOf(FigureColor.values()[number]);
    }
}
