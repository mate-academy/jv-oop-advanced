package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Triangle;
import java.util.Random;

class FigureSupplier {
    Figure getRandomFigure() {
        Random random = new Random();
        int number = random.nextInt(5) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (number) {
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
            case 5: {
                Figure circle = new Circle(random.nextInt(50));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            } default: {
                return null;
            }
        }
    }

    Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("White");
        return circle;
    }
}
