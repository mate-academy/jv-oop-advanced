package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.Shapes;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private final int randomizer = random.nextInt(Shapes.values().length) + 1;

    public Figure getRandomFigure() {
        switch (randomizer) {
            case 1: return new Circle(
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 2: return new Square(
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 3: return new Rectangle(
                    random.nextDouble(100),
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 4: return new RightTriangle(
                    random.nextDouble(100),
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 5: return new IsoscelesTrapezoid(
                    random.nextDouble(100),
                    random.nextDouble(100),
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            default: return new Circle(10, Color.WHITE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
