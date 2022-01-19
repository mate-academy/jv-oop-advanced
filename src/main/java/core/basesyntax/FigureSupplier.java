package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    protected Figure getRandomFigure() {
        switch (random.nextInt(4)) {
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

    protected Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }
}
