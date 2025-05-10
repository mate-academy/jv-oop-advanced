package core.basesyntax.service;

import core.basesyntax.entities.Color;
import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        return List.of(Color.values())
                .get(random.nextInt(List.of(Color.values()).size()));
    }
}
