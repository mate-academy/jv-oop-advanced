package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        String randomColor = Color.values()[index].name();
        return randomColor.toLowerCase();
    }
}
