package core.basesyntax.service;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_SIZE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURE_TYPES_COUNT) + 1;
        String color = colorSupplier.getRandomColor();

        int side;
        int radius;
        int width;
        int height;
        int base;
        int firstLeg;
        int secondLeg;

        switch (randomIndex) {
            case 1:
                side = random.nextInt(MAX_SIZE) + 1;
                return new Square(side, color);
            case 2:
                radius = random.nextInt(MAX_SIZE) + 1;
                return new Circle(radius, color);
            case 3:
                width = random.nextInt(MAX_SIZE) + 1;
                height = random.nextInt(MAX_SIZE) + 1;
                return new Rectangle(width, height, color);
            case 4:
                firstLeg = random.nextInt(MAX_SIZE) + 1;
                secondLeg = random.nextInt(MAX_SIZE) + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 5:
                base = random.nextInt(MAX_SIZE) + 1;
                height = random.nextInt(MAX_SIZE) + 1;
                side = random.nextInt(MAX_SIZE) + 1;
                return new IsoscelesTrapezoid(base, height, side, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
