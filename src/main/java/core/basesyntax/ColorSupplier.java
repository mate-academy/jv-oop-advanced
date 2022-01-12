package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String[] colorsArray = new String[] {"white", "blue", "yellow"};

    public String getDefaultColor () {
        return colorsArray[0];
    }

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colorsArray.length);
        return colorsArray[randomIndex];
    }
}
