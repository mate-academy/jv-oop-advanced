package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getDefaultColor() {
        return Colors.WHITE.toString();
    }
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
