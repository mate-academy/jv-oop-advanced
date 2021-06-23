package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        // creating a list of colors to randomly pick up one of those
        String[] figureArray = new String[] {"Blue", "Red", "Yellow", "Black",
                "White", "Green", "Brown"};
        Random resultIndex = new Random();

        return figureArray[resultIndex.nextInt(figureArray.length)];
    }
}
