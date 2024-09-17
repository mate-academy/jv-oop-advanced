package core.basesyntax;

import java.util.Random;

public class SquareSupplier {
    private Random random = new Random();
    private RandomSize size = new RandomSize();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomSquare() {
        return new Square(size.getRandomSize(), color.getRandomColor());
    }
}
