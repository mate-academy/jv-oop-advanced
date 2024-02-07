package core.basesyntax.supliers;

import core.basesyntax.interfaces.Color;
import core.basesyntax.shapes.Circle;
import core.basesyntax.shapes.IsoscelesTrapezoid;
import core.basesyntax.shapes.Rectangle;
import core.basesyntax.shapes.RightTriangle;
import core.basesyntax.shapes.Shape;
import core.basesyntax.shapes.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS_OF_DEFAULT_FIGURE = 10;
    private static final int RANDOM_INT_BOUND = 7;
    private static final int TOTAL_SHAPES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Shape getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomInt = random.nextInt(TOTAL_SHAPES);
        int randomInt1 = random.nextInt(RANDOM_INT_BOUND) + 1;
        int randomInt2 = random.nextInt(RANDOM_INT_BOUND) + 1;
        int randomInt3 = random.nextInt(RANDOM_INT_BOUND) + 1;

        switch (randomInt) {
            case 0:
                return new Circle(randomColor, randomInt1);
            case 1:
                return new IsoscelesTrapezoid(randomColor, randomInt1, randomInt2, randomInt3);
            case 2:
                return new Rectangle(randomColor, randomInt1, randomInt2);
            case 3:
                return new RightTriangle(randomColor, randomInt1, randomInt2);
            case 4:
                return new Square(randomColor, randomInt1);
            default:
                return getDefaultFigure();
        }

    }

    public Shape getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS_OF_DEFAULT_FIGURE);
    }
}
