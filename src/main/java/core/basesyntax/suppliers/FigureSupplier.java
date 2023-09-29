package core.basesyntax.suppliers;

import core.basesyntax.enums.FigureColor;
import core.basesyntax.enums.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = FigureColor.WHITE.name();
    private static final int DEFAULT_PROPERTY = 10;
    private static final int MAX_VALUE_OF_PROPERTY = 20;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FigureType.values().length);
        int randomProperty1 = random.nextInt(MAX_VALUE_OF_PROPERTY);
        int randomProperty2 = random.nextInt(MAX_VALUE_OF_PROPERTY);
        int randomProperty3 = random.nextInt(MAX_VALUE_OF_PROPERTY);
        String randomColor = new ColorSupplier().getRandomColor();
        if (randomIndex == 0) {
            return new Circle(randomColor, randomProperty1);
        }
        if (randomIndex == 1) {
            return new IsoscelesTrapezoid(randomColor,
                    randomProperty1, randomProperty2, randomProperty3);
        }
        if (randomIndex == 2) {
            return new Rectangle(randomColor, randomProperty1, randomProperty2, randomProperty3);
        }
        if (randomIndex == 3) {
            return new RightTriangle(randomColor, randomProperty1, randomProperty2);
        }
        return new Square(randomColor, randomProperty1);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_PROPERTY);
    }
}
