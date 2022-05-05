package core.basesyntax;

//import java.awt.*;
import java.util.Random;

public class ColorSupplier {

    public String getColorSupplier() {
        int index = new Random().nextInt(Color.values().length);
        //System.out.println(index);
        return Color.values()[index].name();
        //new Random().nextInt(Color.values().length);
    }
}
