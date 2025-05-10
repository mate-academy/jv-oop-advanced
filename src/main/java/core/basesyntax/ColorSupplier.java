package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int indexColor = new Random().nextInt(AllColors.values().length);
        return AllColors.values()[indexColor].toString();
    }
}
