package core.basesyntax;

import java.util.Random;

public class ColorGenerator {
    public String getRandomColor() {
        int randomGenerateIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGenerateIndex].toString();
    }
}
