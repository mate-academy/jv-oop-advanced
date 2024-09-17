package core.basesyntax;
import java.util.Random;
public class RightTriangleSupplier {
    private Random random = new Random();
    private RandomSize size = new RandomSize();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomRightTriangle() {
        return new RightTriangle(size.getRandomSize(),
                size.getRandomSize(), color.getRandomColor());
    }
}
