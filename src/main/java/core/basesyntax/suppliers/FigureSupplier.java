package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_VALUE = 10;
    private static final int MAX_VALUE = 20;
    private static final int FIGURE_TYPES_QTY = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureType[] figureTypes = FigureType.values();
    private Figure resultFigure;



    public Figure getRandomFigure() {
        String figureName = figureTypes[random.nextInt(FIGURE_TYPES_QTY)].toString();


        switch (figureName) {
            case "CIRCLE" :
                resultFigure = new Circle(getRandomLength());
                break;
            case "SQUARE" :
                resultFigure = new Square(getRandomLength());
                break;
            case "ISOSCELES_TRAPEZOID" :
                int rightLegLength;
                int leftLegLength;
                int upperBase;
                int downBase;
                do {
                    rightLegLength = getRandomLength();
                    leftLegLength = getRandomLength();
                    upperBase = getRandomLength();
                    downBase = getRandomLength();
                } while (downBase != upperBase && leftLegLength == rightLegLength);
                resultFigure = new IsoscelesTrapezoid(rightLegLength,leftLegLength,upperBase,downBase);
                break;
            case "RECTANGLE" :
                int rightWidthLength;
                int leftWidhtLength;
                int upperLength;
                int downLength;
                do {
                    rightWidthLength = getRandomLength();
                    leftWidhtLength = getRandomLength();
                    upperLength = getRandomLength();
                    downLength = getRandomLength();
                } while (leftWidhtLength < 0 && downLength < 0
                        && downLength != upperLength
                        && leftWidhtLength != rightWidthLength
                        && leftWidhtLength == upperLength);
                resultFigure = new Rectangle(rightWidthLength,leftWidhtLength,upperLength,downLength);
                break;
            case "RIGHT_TRIANGLE" :
                int leg = getRandomLength();
                int hypotenuse = leg * 2;
                resultFigure = new RightTriangle(leg, hypotenuse);
                break;
            default:
                resultFigure = new Circle(DEFAULT_VALUE);
                resultFigure.setColor(Color.WHITE.name());
                break;
        }
        resultFigure.setColor(colorSupplier.getColor());
        return resultFigure;
    }

    public Figure getDefaultFigure() {
        resultFigure = new Circle(DEFAULT_VALUE);
        resultFigure.setColor(Color.WHITE.name());
        return resultFigure;
    }

    private int getRandomLength() {
        return random.nextInt(DEFAULT_VALUE, MAX_VALUE);
    }
}
