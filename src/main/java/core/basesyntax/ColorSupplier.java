package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLOR = {
            "red", "white", "black", "yellow", "green", "pink", "purple"
    };

    public String getRandomColor() {
        int index = new Random().nextInt(COLOR.length);
        return COLOR[index];
    }
}
