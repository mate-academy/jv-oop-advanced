package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Colores[] values = Colores.values();
        int getRandomIndex = new Random().nextInt(Colores.values().length);
        return values[getRandomIndex].name();
    }
}
