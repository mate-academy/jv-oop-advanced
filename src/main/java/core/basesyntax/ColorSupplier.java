package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rd = new Random();
        int index = rd.nextInt(Colors.values().length);

        return String.valueOf(Colors.values()[index]);
    }
}
