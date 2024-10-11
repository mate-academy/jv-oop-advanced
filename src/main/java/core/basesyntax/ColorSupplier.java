package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {

        int randomNum = random.nextInt(Colors.values().length);
        Colors[] randomColor = Colors.values();

        return randomColor[randomNum].name();
    }

}
