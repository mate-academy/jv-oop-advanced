package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 4;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = "WHITE";
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_RANDOM_NUMBER)) {
            case 1: {
                Figure triangle = new Triangle(random.nextInt(50), random.nextInt(50));
                triangle.setColor(colorSupplier.getRandomColor());
                return triangle;
            }
            case 2: {
                Figure square = new Square(random.nextInt(50));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            }
            case 3: {
                Figure rectangle = new Rectangle(random.nextInt(50), random.nextInt(50));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            }
            case 4: {
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(50),
                        random.nextInt(50), random.nextInt(50));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            }
            default: {
                Figure circle = new Circle(random.nextInt(50));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            }
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(CIRCLE_RADIUS);
        circle.setColor(CIRCLE_COLOR);
        return circle;
    }
}
