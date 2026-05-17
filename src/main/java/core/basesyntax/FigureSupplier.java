package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 5;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return figureArray()[random.nextInt(NUMBER)];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10d);
    }

    private Figure[] figureArray() {
        Figure[] figures = new Figure[NUMBER];
        figures[0] = new Circle(colorSupplier.getRandomColor(), random.nextDouble(NUMBER));
        figures[1] = new Square(colorSupplier.getRandomColor(), random.nextInt(NUMBER));
        figures[2] = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(NUMBER), random.nextInt(NUMBER));
        figures[3] = new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(NUMBER),
                random.nextDouble(10d));
        figures[4] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(NUMBER),
                random.nextInt(10), random.nextInt(10));
        return figures;
    }
}
