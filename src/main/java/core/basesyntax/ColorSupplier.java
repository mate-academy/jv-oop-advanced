package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return FigureColor.values()[(new Random()).nextInt(FigureColor.values().length)].toString()
                .toLowerCase();
    }
}
