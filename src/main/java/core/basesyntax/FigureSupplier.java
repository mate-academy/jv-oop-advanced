package core.basesyntax;

import core.basesyntax.concretefigures.Circle;
import core.basesyntax.concretefigures.IsoscelesTrapezoid;
import core.basesyntax.concretefigures.Rectangle;
import core.basesyntax.concretefigures.RightTriangle;
import core.basesyntax.concretefigures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int MAX_PARAMETER_VALUE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {

        int randomFigure = random.nextInt(AMOUNT_OF_FIGURES);

        switch (randomFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomParameter());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomParameter(),
                        getRandomParameter(),
                        getRandomParameter());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomParameter(),
                        getRandomParameter());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomParameter(),
                        getRandomParameter());
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomParameter());
            default:
                return getDefaultFigure();
        }

    }

    private int getRandomParameter() {
        return new Random().nextInt(MAX_PARAMETER_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
