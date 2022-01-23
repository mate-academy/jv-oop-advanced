package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                Square square = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
                return square;
            case 1:
                Circle circle = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
                circle.draw();
                return circle;
            case 2:
                Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, new Random().nextInt(10) + 1);
                rectangle.draw();
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
                rightTriangle.draw();
                return rightTriangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                random.nextInt(10) + 1,
                                random.nextInt(10) + 1,
                                random.nextInt(10) + 1);
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle("WHITE", 10);
        circle.draw();
        return circle;
    }
}
