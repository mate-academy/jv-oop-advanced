package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Random randomObjectInitialization = new Random();
    private final String[] colors = {"green", "yellow", "blue", "white", "black"};

    public String getRandomColor() {
        int randomNumber = randomObjectInitialization.nextInt(colors.length);
        return colors[randomNumber];
    }

}
