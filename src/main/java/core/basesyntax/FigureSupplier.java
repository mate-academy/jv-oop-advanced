package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private CircleSupplier circle = new CircleSupplier();
    private IsoscelesTrapezoidSupplier isoscelesTrapezoid = new IsoscelesTrapezoidSupplier();
    private RectangleSupplier rectangle = new RectangleSupplier();
    private SquareSupplier square = new SquareSupplier();
    private RectangleSupplier rightTriangle = new RectangleSupplier();

    public Figure getRandomFigure() {
        Figure [] figures = {
                circle.getRandomCircle(),
                isoscelesTrapezoid.getRandomIsoscelesTrapezoid(),
                rectangle.getRandomRectangle(),
                square.getRandomSquare(),
                rightTriangle.getRandomRectangle()
        };

        int randomIndex = random.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        Figure defaulFigure = new Circle(10, Color.WHITE);
        return defaulFigure;
    }
}
