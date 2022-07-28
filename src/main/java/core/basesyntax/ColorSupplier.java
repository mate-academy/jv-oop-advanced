package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int number = random.nextInt(FigureColor.values().length);
        return String.valueOf(FigureColor.values()[number]);
    }
}
