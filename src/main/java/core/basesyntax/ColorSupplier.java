package core.basesyntax;

import java.util.Random;

public class ColorSupplier implements RandomColorGenerator {
    public static final String[] colors = {
            "black",
            "grey",
            "light_grey",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple",
            "pink",
            "white",
    };

    @Override
    public String generateColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
