package core.basesyntax.supplier;

import core.basesyntax.behaviour.Suppliable;
import java.util.Random;

public abstract class BasicRandomValueSupplier implements Suppliable {
    protected final Random randomGenerator = new Random();
}
