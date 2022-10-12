package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {

        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();

        Figure[] figures = {
                new Circle(
                        supplier.getRandomColor(),
                        "Circle",
                        random.nextInt(15)
                ),
                new Square(
                        supplier.getRandomColor(),
                        "Square",
                        random.nextInt(15)
                ),
                new Rectangle(
                        supplier.getRandomColor(),
                        "Rectangle", random.nextInt(25),
                        random.nextInt(25)
                ),
                new RightTriangle(
                        supplier.getRandomColor(),
                        "Triangle", random.nextInt(40),
                        random.nextInt(40)
                ),
                new IsoscelesTrapezoid(
                        supplier.getRandomColor(),
                        "Trapezoid",
                        random.nextInt(30),
                        random.nextInt(30),
                        random.nextInt(30)
                )
        };
        return figures[new Random().nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(10);
    }
}
