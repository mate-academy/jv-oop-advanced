package core.basesyntax.main;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private double getRandomDouble() {

        return random.nextDouble();
    }

    public Figure getRandomFigure() {
        int indexRandomFigure = random.nextInt(5);

        switch (indexRandomFigure) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomDouble());
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomDouble());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
        }
    }

    public String getDefaultFigure() {
        return ("Figure: " + Circle.class.getSimpleName()
                + ", radius: " + 10 + ", color: " + Color.WHITE);
    }
}


