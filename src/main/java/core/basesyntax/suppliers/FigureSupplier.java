package core.basesyntax.suppliers;

import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        if (index == 1) {
            return new Circle(random.nextInt(MAX_NUMBER),
                    colorSupplier.getRandomColor());
        } else if (index == 2) {
            return new IsoscelesTrapezoid(random.nextInt(MAX_NUMBER),
                    random.nextInt(MAX_NUMBER),
                    random.nextInt(MAX_NUMBER),
                    colorSupplier.getRandomColor());
        } else if (index == 3) {
            return new Rectangle(random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                    colorSupplier.getRandomColor());
        } else if (index == 4) {
            return new RightTriangle(random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                    colorSupplier.getRandomColor());
        } else {
            return new Square(random.nextInt(MAX_NUMBER),
                    colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.values()[0].toString());
    }
}
