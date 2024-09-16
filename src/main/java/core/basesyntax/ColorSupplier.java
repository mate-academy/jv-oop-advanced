package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int index = RANDOM.nextInt(Colors.values().length);
        Colors figureColor = Colors.values()[index];
        return figureColor.name();
    }

    public String getConstantColor() {
        Colors figureColor = Colors.values()[Colors.values().length - 1];
        return figureColor.name();
    }
}
