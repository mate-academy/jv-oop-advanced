package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(9)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getRandomSquare() {
        int side = random.nextInt(50) + 11;
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    public Figure getRandomCircle() {
        int radius = random.nextInt(25) + 6;
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Figure getRandomRectangle() {
        int sideA = random.nextInt(50) + 11;
        int sideB = random.nextInt(50) + 11;
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color, sideA, sideB);
    }

    public Figure getRandomRightTriangle() {
        int firstLeg = random.nextInt(50) + 11;
        int secondLeg = random.nextInt(50) + 11;
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int sideA = random.nextInt(50) + 11;
        int sideB = random.nextInt(50) + 11;
        int height = random.nextInt(50) + 11;
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, sideA, sideB, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
