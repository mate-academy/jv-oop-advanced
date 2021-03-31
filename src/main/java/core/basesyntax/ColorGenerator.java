package core.basesyntax;

import java.util.Random;

public class ColorGenerator {
    String getRandomColor() {
        int randomGenerateIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGenerateIndex].toString();
    }
}
