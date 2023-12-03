package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        //return String.valueOf(Colors.values()[index]);
        return Color.values()[index].name();
    }
}
