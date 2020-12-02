package core.basesyntax;

import java.util.Random;

class ColorProducer {

    public Color getColor() {
        int randomNumber = new Random().nextInt(Color.values().length);
        return Color.values()[randomNumber];
    }
}
