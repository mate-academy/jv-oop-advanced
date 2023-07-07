package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int i = new Random().nextInt(Color.values().length - 1);
        return Color.values()[i].name();
    }
}
