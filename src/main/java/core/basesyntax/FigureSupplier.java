package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(color, random.nextDouble() * MAX_SIZE);
            case 1:
                return new Square(color, random.nextDouble() * MAX_SIZE);
            case 2:
                return new Rectangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble()
                        * MAX_SIZE);
            case 3:
                return new RightTriangle(color, random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            default:
                throw new IllegalArgumentException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
