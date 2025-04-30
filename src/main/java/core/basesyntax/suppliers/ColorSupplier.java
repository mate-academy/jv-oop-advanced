package core.basesyntax.suppliers;

import core.basesyntax.Colors;
import core.basesyntax.figures.Figure;
import java.util.Random;

public class ColorSupplier {
    public void setRandomColor(Figure figure) {
        Random random = new Random();
        int colorIndex = random.nextInt(Colors.values().length);
        Colors colorToSet = Colors.values()[colorIndex];
        figure.setColor(colorToSet);
    }
}
