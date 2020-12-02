package core.basesyntax;

import java.util.Random;

public class GenerateColor {
    public static Colors get() {
        int indexColor = new Random().nextInt(Colors.values().length);
        return Colors.values()[indexColor];
    }
}
