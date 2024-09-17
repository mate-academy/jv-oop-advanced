package core.basesyntax;
import java.util.Random;
public class IsoscelesTrapezoidSupplier {
    private Random random = new Random();
    private RandomSize size = new RandomSize();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(size.getRandomSize(), size.getRandomSize(),
                size.getRandomSize(), color.getRandomColor());
    }
}
