package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figural getRandomFigure() {

        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                square square = new square(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
                square.draw();
                return square;

            case 1:
                Circle circle = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
                circle.draw();
                return circle;

            case 2:
                Rectangle1 rectangle = new Rectangle1(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, new Random().nextInt(10) + 1);
                rectangle.draw();
                return rectangle;

            case 3:
                right_triangle right_triangle = new right_triangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
                right_triangle.draw();
                return right_triangle;

            default:
                isosceles_trapezoid isoscelesTrapezoid =
                        new isosceles_trapezoid(colorSupplier.getRandomColor(),
                                random.nextInt(10) + 1,
                                random.nextInt(10) + 1,
                                random.nextInt(10) + 1);
                isoscelesTrapezoid.draw();
                return isoscelesTrapezoid;

        }
    }

    public Figural getDefaultFigure() {
        Circle circle = new Circle("WHITE", 10);
        circle.draw();
        return circle;
    }
}

