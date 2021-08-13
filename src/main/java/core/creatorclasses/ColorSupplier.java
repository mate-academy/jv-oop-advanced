package core.creatorclasses;

import core.interfaces.Constants;
import java.util.Random;

public class ColorSupplier implements Constants {
    public String getRandomColor() {
        Random rand = new Random();
        return COLORS[rand.nextInt(NUMBER)];
    }
}
