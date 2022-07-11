package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        //random index of the elements in ENUM with colors
        return Color.values()[index].name().toLowerCase();
        //index-color from ENUM with colors
    }
}
