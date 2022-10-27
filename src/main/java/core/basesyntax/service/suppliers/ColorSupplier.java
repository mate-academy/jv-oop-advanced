package core.basesyntax.service.suppliers;

import core.basesyntax.Colors;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor()  {
        int colIndex = new Random().nextInt(Colors.values().length - 1);
        return Colors.values()[colIndex].name();
    }
}
