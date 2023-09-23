package core.basesyntax.services;

import core.basesyntax.Colors;
import core.basesyntax.model.Figure;

public class ColorSupplier extends Figure {

    public String getRandomColor() {
        int index = getRandom().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.name().toLowerCase();
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
