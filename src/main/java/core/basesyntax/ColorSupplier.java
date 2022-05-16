package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length - 1); // -1 bound exception
        return Color.values()[colorIndex].name(); // return random index Color
    }
}
