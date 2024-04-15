package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaProvider, Drawable {
    final Random random = new Random();
    final ColorSupplier colorSupplier = new ColorSupplier();
}
