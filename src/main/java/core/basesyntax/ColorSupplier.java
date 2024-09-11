package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors figureColor = Colors.values()[index];
        return figureColor.toString();
    }

    public String getConstantColor() {
        Colors figureColor = Colors.values()[5];
        return figureColor.toString();
    }
}
