package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public String getRondomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
