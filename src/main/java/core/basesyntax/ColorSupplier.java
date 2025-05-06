package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    public String getRandomColor() {
        Figure.Color[] colors = Figure.Color.values();

        return colors[ThreadLocalRandom.current()
                .nextInt(0, colors.length)]
                .name();
    }
}
