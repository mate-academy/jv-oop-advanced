package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
/*package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
         int i = new Random().nextInt(Color.values().length);
         return Color.values()[i];
}
}
*/



