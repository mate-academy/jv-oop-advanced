package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int number = Color.values().length;
        int index = new Random().nextInt(number);
        return Color.values()[index].toString().toLowerCase();
    }
}
