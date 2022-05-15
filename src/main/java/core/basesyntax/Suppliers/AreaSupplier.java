package core.basesyntax.Suppliers;

import java.util.Random;

public class AreaSupplier {
    public int getRandomArea() {
        return new Random().nextInt(1000);
    }

    public int getRandomValue() {
        return new Random().nextInt(100);
    }

    public int getDefaultArea() {
        return 10;
    }
}
