package core.basesyntax.suplier;

import core.basesyntax.Color;

public class ColorSupplier extends Supplier {
    public String getRandomColor() {
        return Color.values()[getRandom().nextInt(Color.values().length)].name();
    }
}
