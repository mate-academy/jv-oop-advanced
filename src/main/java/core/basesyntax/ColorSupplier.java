package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(EnumColor.values().length);
        EnumColor color = EnumColor.values()[index];
        return color.name();
    }
}
