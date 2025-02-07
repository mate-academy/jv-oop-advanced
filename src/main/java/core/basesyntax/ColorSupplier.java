package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier extends Figure {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.toString();
    }
}
