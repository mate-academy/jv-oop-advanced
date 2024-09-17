package core.basesyntax;

import java.util.Random;

public class CircleSupplier {
    private Random random = new Random();
    private RandomSize size = new RandomSize();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(size.getRandomSize(), color.getRandomColor());
    }
}
