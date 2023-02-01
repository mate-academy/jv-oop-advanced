package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private String [] randomColor = new String[] {"Red","Blue","White","Multicolor","Gray","Brown"};

    public String getRandomColor() {
        Random random = new Random();
        int figureNumber = random.nextInt(randomColor.length);
        return randomColor[figureNumber];
    }
}
