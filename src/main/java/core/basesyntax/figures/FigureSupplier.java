package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    int getRandomProperties() {
        return new Random().nextInt(20);
    }

    public Figure getRandomFigure() {
        int figure = new Random().nextInt(5);
        if (figure == 0) {
            return new Square(colorSupplier.getRandomColor(),
                    getRandomProperties());
        } else if (figure == 1) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomProperties(),
                    getRandomProperties());
        } else if (figure == 2) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomProperties(),
                    getRandomProperties());
        } else if (figure == 3) {
            return new Circle(colorSupplier.getRandomColor(),
                    getRandomProperties());
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomProperties(),
                getRandomProperties(),
                getRandomProperties());
    }

    // this method should always return white circle with radius 10.
    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
