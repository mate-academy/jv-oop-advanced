package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private CircleSupplier circle = new CircleSupplier();
    private IsoscelesTrapezoidSupplier isoscelesTrapezoid
            = new IsoscelesTrapezoidSupplier();
    private RectangleSupplier rectangle = new RectangleSupplier();
    private SquareSupplier square = new SquareSupplier();
    private RightTriangleSupplier rightTriangle = new RightTriangleSupplier();

    private int defaultRadius = 10;
    private Color defaultColor = Color.WHITE;

    public Figure getRandomFigure() {
        Figure [] figures = {
                circle.getRandomCircle(),
                isoscelesTrapezoid.getRandomIsoscelesTrapezoid(),
                rectangle.getRandomRectangle(),
                square.getRandomSquare(),
                rightTriangle.getRandomRightTriangle()
        };

        int randomIndex = random.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }
}
