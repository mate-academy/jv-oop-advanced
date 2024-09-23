package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    public static final int RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Circle defaultCircle = new Circle(Color.WHITE.name(), RADIUS);

    public Figure getRandomFigure() {
        int random = new Random().nextInt(5);
        switch (random) {
            case 1: { // Triangle
                double base = getRandom();
                double height = getRandom();
                String color = colorSupplier.getRandomColor();
                return new RightTriangle(color, base, height);
            }
            case 2: { // Circle
                double radius = getRandom();
                String color = colorSupplier.getRandomColor();
                return new Circle(color, radius);
            }
            case 3: { // Rectangle
                double length = getRandom();
                double width = getRandom();
                String color = colorSupplier.getRandomColor();
                return new Rectangle(color, length, width);
            }
            case 4: { // Square
                double side = getRandom();
                String color = colorSupplier.getRandomColor();
                return new Square(color, side);
            }
            default: { // Isosceles Trapezoid
                double firstBase = getRandom();
                double secondBase = getRandom();
                double height = getRandom();
                String color = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }

    private double getRandom() {
        return Math.round(random.nextDouble(50) * 10.0) / 10.0;
    }
}
