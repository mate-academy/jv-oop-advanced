package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static int QUANTITY_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(QUANTITY_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (indexOfFigure) {
            case 0:
                return new Circle(color, getRandomLength());
            case 1:
                return new IsoscelesTrapezoid(color, getRandomLength(), getRandomLength(),
                        getRandomLength());
            case 2:
                return new Rectangle(color, getRandomLength(), getRandomLength());
            case 3:
                return new RightTriangle(color, getRandomLength(), getRandomLength());
            case 4:
                return new Square(color, getRandomLength());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double getRandomLength() {
        return random.nextDouble();
    }
}
