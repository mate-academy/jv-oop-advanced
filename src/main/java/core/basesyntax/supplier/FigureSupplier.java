package core.basesyntax.supplier;

import static core.basesyntax.enums.Color.WHITE;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.impl.Circle;
import core.basesyntax.figures.impl.IsoscelesTrapezoid;
import core.basesyntax.figures.impl.Rectangle;
import core.basesyntax.figures.impl.RightTriangle;
import core.basesyntax.figures.impl.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int INDEX_BOUND = 5;
    private static final int PROPERTY_BOUND = 50;
    private static final int CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(WHITE.getValue(), CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(INDEX_BOUND);
        switch (randomIndex) {
            case 0:
                return generateCircle();
            case 1:
                return generateTrapezoid();
            case 2:
                return generateRectangle();
            case 3:
                return generateTriangle();
            case 4:
                return generateSquare();
            default:
                return null;
        }
    }

    private Circle generateCircle() {
        int radius = getRandomSize();
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid generateTrapezoid() {
        int topBase = getRandomSize();
        int bottomBase = getRandomSize();
        int height = getRandomSize();
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }

    private Rectangle generateRectangle() {
        int height = getRandomSize();
        int width = getRandomSize();
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, height, width);
    }

    private RightTriangle generateTriangle() {
        int firstLeg = getRandomSize();
        int secondLeg = getRandomSize();
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square generateSquare() {
        int side = getRandomSize();
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private int getRandomSize() {
        return random.nextInt(PROPERTY_BOUND);
    }
}
