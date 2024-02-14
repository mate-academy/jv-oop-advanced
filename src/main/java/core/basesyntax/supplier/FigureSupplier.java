package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "WHITE";
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String figureColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;

        Figure figure;

        switch (figureNumber) {
            case 0:
                figure = new Square(figureColor, randomNumber);
                break;
            case 1:
                figure = new Rectangle(figureColor, randomNumber, random.nextInt(MAX_NUMBER) + 1);
                break;
            case 2:
                figure = new RightTriangle(figureColor, randomNumber,
                        random.nextInt(MAX_NUMBER) + 1);
                break;
            case 3:
                figure = new Circle(figureColor, randomNumber);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(figureColor, randomNumber,
                        random.nextInt(MAX_NUMBER) + 1, random.nextInt(MAX_NUMBER) + 1);
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_NUMBER);
    }
}
