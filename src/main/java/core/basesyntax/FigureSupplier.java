package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {

        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int boundNumber = 15;

        Figure[] figures = {
                new Circle(
                        supplier.getRandomColor(),
                        "Circle",
                        random.nextInt(boundNumber)
                ),
                new Square(
                        supplier.getRandomColor(),
                        "Square",
                        random.nextInt(boundNumber)
                ),
                new Rectangle(
                        supplier.getRandomColor(),
                        "Rectangle", random.nextInt(boundNumber),
                        random.nextInt(boundNumber)
                ),
                new RightTriangle(
                        supplier.getRandomColor(),
                        "Triangle", random.nextInt(boundNumber),
                        random.nextInt(boundNumber)
                ),
                new IsoscelesTrapezoid(
                        supplier.getRandomColor(),
                        "Trapezoid",
                        random.nextInt(boundNumber),
                        random.nextInt(boundNumber),
                        random.nextInt(boundNumber)
                )
        };
        return figures[new Random().nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        return new Circle(radius);
    }
}
