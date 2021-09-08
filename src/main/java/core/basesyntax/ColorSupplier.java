package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final String[] COLOR_LIST = {"green", "yellow", "blue", "white", "black"};

    public String getRandomColor() {
        int randomNumber = random.nextInt(COLOR_LIST.length);
        return COLOR_LIST[randomNumber];
    }
}
