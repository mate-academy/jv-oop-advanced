package core.basesyntax;

import java.util.Random;

public class ColorsProducer {

    public Colors getColor() {

        int randomIdex = new Random().nextInt(Colors.values().length);

        return Colors.values()[randomIdex];
    }
}
