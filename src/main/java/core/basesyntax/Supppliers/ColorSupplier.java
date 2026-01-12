package core.basesyntax.Supppliers;

import core.basesyntax.enums.Color;

import java.util.Random;

public class ColorSupplier {

    public String getColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        return colors[random.nextInt(9)].toString();
    }
}
