package core.basesyntax.supplier;

import core.basesyntax.model.Colors;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(){
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].toString().toLowerCase(Locale.ROOT);
    }
}
