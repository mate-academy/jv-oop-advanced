package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String[] colorsArray = new String[] {"white", "blue", "yellow"};
    Random random = new Random();

    public String getDefaultColor () {
        return colorsArray[0];
    }

    public String getRandomColor() {
        int randomIndex = random.nextInt(colorsArray.length);
        return colorsArray[randomIndex];
    }
}
