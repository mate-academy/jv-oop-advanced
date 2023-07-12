package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.suppliers.Color;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_NUM = 10;
    private static final int NUM_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUM_OF_FIGURES)) {
            case 0:
                return new Square(color.getRandomColor(),
                    random.nextDouble() * MAX_NUM);
            case 1:
                return new Rectangle(color.getRandomColor(),
                    (int) (random.nextDouble() * MAX_NUM),
                    (int) (random.nextDouble() * MAX_NUM + 1));
            case 2:
                return new Circle(color.getRandomColor(),
                    (int) (random.nextDouble() * MAX_NUM));
            case 3:
                return new RightTriangle(
                    color.getRandomColor(),
                    (int) (random.nextDouble() * MAX_NUM),
                    (int) (random.nextDouble() * MAX_NUM)
                );

            default:
                return new IsoscelesTrapezoid(color.getRandomColor(),
              random.nextDouble() * MAX_NUM,
              random.nextDouble() * MAX_NUM,
             random.nextDouble() * MAX_NUM);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}

