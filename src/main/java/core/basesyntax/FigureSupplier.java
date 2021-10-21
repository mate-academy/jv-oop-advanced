package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Trapezoid;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 6;
    private static final int RANDOM_RADIUS = 15;
    private static final int DEFAULT_RADIUS = 10;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(MAX_NUMBER);
        switch (randomIndex) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomTrapezoid();
            case 5:
            default:
                return getRandomTriangle();
        }
    }

    public Figure getDefaultFigure() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        return new Circle(color, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int radius = random.nextInt(RANDOM_RADIUS);
        return new Circle(color, radius);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int radius = random.nextInt(RANDOM_RADIUS);
        return new Rectangle(color, radius);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int radius = random.nextInt(RANDOM_RADIUS);
        return new Square(color, radius);
    }

    private Figure getRandomTrapezoid() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int radius = random.nextInt(RANDOM_RADIUS);
        return new Trapezoid(color, radius);
    }

    private Figure getRandomTriangle() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int radius = random.nextInt(RANDOM_RADIUS);
        int leftLeg = random.nextInt(RANDOM_RADIUS);
        int rightLeg = random.nextInt(RANDOM_RADIUS);
        return new Triangle(color, radius, leftLeg, rightLeg);
    }
}
