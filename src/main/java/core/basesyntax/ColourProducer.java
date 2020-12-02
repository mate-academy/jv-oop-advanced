package core.basesyntax;

import java.util.Random;

public class ColourProducer {
    public Colour get() {
        int randomColour = new Random().nextInt(Colour.values().length);
        return Colour.values()[randomColour];
    }

}
