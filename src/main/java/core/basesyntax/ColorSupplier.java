package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String [] color = {"white", "red", "orange", "yellow",
            "green", "blue", "violet", "pink", "black"};

    public String getRandomColor() {
        return color [new Random().nextInt(color.length)];
    }
}
