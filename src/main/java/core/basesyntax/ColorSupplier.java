package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String[] COLOR_LIST = {"green", "yellow", "blue", "white", "black"};
    private Random random = new Random();

    public String getRandomColor() {
        int randomNumber = random.nextInt(COLOR_LIST.length);
        return COLOR_LIST[randomNumber];
    }
}
