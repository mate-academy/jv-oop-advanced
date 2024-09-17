package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final CircleSupplier circle = new CircleSupplier();
    private static final IsoscelesTrapezoidSupplier isoscelesTrapezoid
            = new IsoscelesTrapezoidSupplier();
    private static final RectangleSupplier rectangle = new RectangleSupplier();
    private static final SquareSupplier square = new SquareSupplier();
    private static final RectangleSupplier rightTriangle = new RectangleSupplier();

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
        return new Circle(10, Color.WHITE);
    }
}
