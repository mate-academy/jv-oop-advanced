package core.basesyntax;

import java.util.Random;

public class RectangleSupplier {
    private Random random = new Random();
    private RandomSize size = new RandomSize();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomRectangle() {
        return new Rectangle(size.getRandomSize(),
                size.getRandomSize(), color.getRandomColor());
    }
}
