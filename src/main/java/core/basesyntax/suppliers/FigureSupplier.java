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
    private static final int DEF_NUMBER = 10;
    private static final String DEF_COLOR = "white";
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        return index == 1 ? new Circle(randomNumber(), randomColor())
                : index == 2 ? new IsoscelesTrapezoid(randomNumber(), randomNumber(),
                    randomNumber(), randomColor())
                : index == 3 ? new Rectangle(randomNumber(), randomNumber(), randomColor())
                : index == 4 ? new RightTriangle(randomNumber(), randomNumber(), randomColor())
                : new Square(randomNumber(), randomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_NUMBER, DEF_COLOR);
    }

    private int randomNumber() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        return Math.max(randomNumber, 1);
    }

    private String randomColor() {
        return colorSupplier.getRandomColor().toLowerCase();
    }
}
