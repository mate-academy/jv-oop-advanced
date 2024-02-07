package core.basesyntax.suplier;

import core.basesyntax.Color;

public class ColorSupplier extends RandomSupplier {
    public String getRandomColor() {
        return Color.values()[getRandom().nextInt(Color.values().length)].name();
    }
}
