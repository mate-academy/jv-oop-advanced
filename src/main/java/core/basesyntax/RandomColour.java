package core.basesyntax;

import java.util.Random;

public class RandomColour {
    public Colour get() {
        int randomIndex = new Random().nextInt(Colour.values().length);
        return (Colour.values()[randomIndex]);
    }
}
