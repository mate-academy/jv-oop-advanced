package core.basesyntax.suppliers.figuresuppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.suppliers.colorsuppliers.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private final Color defaultColor = Color.WHITE;
    private final int defaultSideLength = 10;
    private final int minSideLength = 5;
    private final int maxSideLength = 25;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure(int type) {
        int[] figureParameters = generateParameters();
        int firstParameter = figureParameters[0];
        int secondParameter = figureParameters[1];
        int thirdParameter = figureParameters[2];
        Figure figure;
        switch (type) {
            case 1: figure = new Circle(getRandomColor(),
                    firstParameter);
            break;
            case 2: figure = new IsoscelesTrapezoid(getRandomColor(),
                    firstParameter,
                    secondParameter,
                    thirdParameter);
            break;
            case 3: figure = new Rectangle(getRandomColor(),
                    firstParameter,
                    secondParameter);
            break;
            case 4: figure = new RightTriangle(getRandomColor(),
                    firstParameter,
                    secondParameter);
            break;
            case 5: figure = new Square(getRandomColor(),
                    firstParameter);
                break;
            default:
                figure = getDefualtFigure();
        }
        return figure;
    }

    public Figure getDefualtFigure() {
        return new Circle(defaultColor.name(), defaultSideLength);
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    private int[] generateParameters() {
        int first = generateRandomNumber();
        int second = generateRandomNumber();

        while (second > first) {
            second = generateRandomNumber();
        }

        int third = generateRandomNumber();

        return new int[]{first, second, third};
    }

    private int generateRandomNumber() {
        return minSideLength + random.nextInt(maxSideLength);
    }
}
