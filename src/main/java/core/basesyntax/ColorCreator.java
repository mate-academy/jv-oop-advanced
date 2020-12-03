package core.basesyntax;

import java.util.Random;

public class ColorCreator {
    public static Color getColor() {
        int randomInteger = new Random().nextInt(Color.values().length);
        return Color.values()[randomInteger];
    }
}
