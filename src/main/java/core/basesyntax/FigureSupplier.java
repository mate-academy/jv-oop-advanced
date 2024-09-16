package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private RandomSize size = new RandomSize();

    private Figure circle = new Circle(size.getSize(), colorSupplier.getRandomColor());
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(size.getSize(),
            size.getSize(), size.getSize(), colorSupplier.getRandomColor());
    private Figure rectangle = new Rectangle(size.getSize(),
            size.getSize(), colorSupplier.getRandomColor());
    private Figure square = new Circle(size.getSize(),
            colorSupplier.getRandomColor());
    private Figure rightTriangle = new RightTriangle(size.getSize(),
            size.getSize(), colorSupplier.getRandomColor());

    private Figure [] figures = {
            circle,
            isoscelesTrapezoid,
            rectangle,
            square,
            rightTriangle
    };

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        Figure defaulFigure = new Circle(10, Color.WHITE);
        return defaulFigure;
    }
}
