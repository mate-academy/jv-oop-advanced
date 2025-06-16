package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = {Color.BLACK, Color.BLUE, Color.BROWN, Color.GREEN,
            Color.RED, Color.WHITE, Color.YELLOW};

    public String getRandomColor() {
        return (colors[new Random().nextInt(colors.length)].name());
    }

}
