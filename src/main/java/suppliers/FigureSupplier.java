package suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    private final Random random = new Random();
    
    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(5);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getDefaultColor());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return random.nextInt(100);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}
