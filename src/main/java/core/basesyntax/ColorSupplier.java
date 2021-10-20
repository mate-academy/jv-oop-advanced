package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_COUNT = Colors.values().length;
    private int randomInt = new Random().nextInt(COLORS_COUNT);

    public String getRandomColor(){
        Colors randomColor = Colors.values()[randomInt];
        return randomColor.toString();
    }


}
