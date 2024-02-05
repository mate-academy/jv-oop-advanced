package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.model.Figure;
import java.util.Random;


public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure[] figures = new Figure[5];

    public Figure getRandomFigure() {
        Figure square = new Square("Square",
                randomValue(),
                colorSupplier.getRandomColor(),
                randomValue());

        Figure isoscelesTrapezoid = new IsoscelesTrapezoid("Isosceles Trapezoid",
                randomValue(),
                colorSupplier.getRandomColor(),
                randomValue(),
                randomValue(),
                randomValue());

        Figure rightTriangle = new RightTriangle("Right Triangle",
                randomValue(),
                colorSupplier.getRandomColor(),
                randomValue(),
                randomValue(),
                randomValue());

        Figure circle = new Circle("Circle",
                randomValue(),
                colorSupplier.getRandomColor(),
                randomValue());

        Figure rectangle = new Rectangle("Rectangle",
                randomValue(),
                colorSupplier.getRandomColor(),
                randomValue(),
                randomValue());

        figures[0] = square;
        figures[1] = isoscelesTrapezoid;
        figures[2] = rightTriangle;
        figures[3] = circle;
        figures[4] = rectangle;
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("Default Circle", 100, colorSupplier.getWhiteColor(), 10);

    }

    private int randomValue() {
       return random.nextInt(100);
    }
}
