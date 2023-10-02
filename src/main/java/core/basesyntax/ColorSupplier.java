package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] allColors = allColors = Colors.values();
    private Random  random =  new Random();

    public String getRandomColor() {
        int index = random.nextInt(allColors.length);
        return allColors[index].getColor();
    }
}
