package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {

        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                Square square = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
                square.drawFigure();
                return square;

            case 1:
                Circle circle = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
                circle.drawFigure();
                return circle;

            case 2:
                Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, new Random().nextInt(10) + 1);
                rectangle.drawFigure();
                return rectangle;

            case 3:
                RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
                rightTriangle.drawFigure();
                return rightTriangle;

            default:
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                random.nextInt(10) + 1,
                                random.nextInt(10) + 1,
                                random.nextInt(10) + 1);
                isoscelesTrapezoid.drawFigure();
                return isoscelesTrapezoid;

        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle("WHITE", 10);
        circle.drawFigure();
        return circle;
    }
}
