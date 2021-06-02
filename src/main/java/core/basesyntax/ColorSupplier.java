package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colorsArr = Colors.values();
        int randomIndex = new Random().nextInt(colorsArr.length);
        return colorsArr[randomIndex].toString();
    }
}
