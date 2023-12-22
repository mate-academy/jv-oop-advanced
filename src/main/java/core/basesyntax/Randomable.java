package core.basesyntax;

import java.util.Random;

public interface Randomable {
    ColorSupplier colorSupplier = new ColorSupplier();

    Random random = new Random();

    void generateRandomParameters();

}
