package core.basesyntax;

//import java.awt.*;
import java.util.Random;

public class ColorSupplier {

    public String getColorSupplier() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
