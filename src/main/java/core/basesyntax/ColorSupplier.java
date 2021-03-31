package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String randomColor() {
        String[] colors = new String[] {"red", "white", "blue", "purple",
                                        "black", "green", "yellow", "orange"};
        Random rand = new Random();
        return colors[rand.nextInt(8)];
    }

}
