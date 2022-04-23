package core.basesyntax;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int ran = new Random().nextInt(5);
        int a = new Random().nextInt(10);
        switch (ran) {
            case (1):
                Figure x = new Square(a);
                return x;
            default:
                Figure y = new Square(a);
                return y;
        }

    }
    public Figure getDefaultFigure() {
        Figure x = new Square(10);
        return x;
    }
}
