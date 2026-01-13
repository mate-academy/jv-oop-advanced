package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.enums.FigureTypes;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int MIN_VALUE = 10;
    private static final int FIGURE_TYPES_QTY = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureTypes[] figureTypes = FigureTypes.values();
    private Figure resultFigure;


    public Figure getRandomFigure() {
        String figureName = figureTypes[random.nextInt(FIGURE_TYPES_QTY)].toString();

        if (figureName.equals("CIRCLE")) {
            resultFigure = new Circle(getRandomLength());
        }
        if (figureName.equals("SQUARE")) {
            resultFigure = new Square(getRandomLength());
        }
        if (figureName.equals("ISOSCELESTRAPEZOID")) {
            int rightLegLength;
            int leftLegLength;
            int upperBase;
            int downBase;
            do {    rightLegLength = getRandomLength();
                    leftLegLength = getRandomLength();
                    upperBase = getRandomLength();
                    downBase = getRandomLength();
            }  while (downBase != upperBase && leftLegLength == rightLegLength);
            resultFigure = new IsoscelesTrapezoid(rightLegLength,leftLegLength,upperBase,downBase);
        }
        if (figureName.equals("RECTANGLE")) {
            int rightLegLength;
            int leftLegLength;
            int upperBase;
            int downBase;
            do {
                rightLegLength = getRandomLength();
                leftLegLength = getRandomLength();
                upperBase = getRandomLength();
                downBase = getRandomLength();
            }
            while (leftLegLength < 0 && downBase < 0
                    && downBase != upperBase
                    && leftLegLength != rightLegLength
                    && leftLegLength == upperBase);
            resultFigure = new Rectangle(rightLegLength,leftLegLength,upperBase,downBase);
        }
        if (figureName.equals("RIGHTTRIANGLE")) {
            int leg = getRandomLength();
            int hypotenuse = leg * 2;
            resultFigure = new RightTriangle(leg, hypotenuse);
        }
        resultFigure.setColor(colorSupplier.getColor());
        return resultFigure;
    }

    public Figure getDefaultFigure() {
        String defaultColor = "white";
        resultFigure = new Circle(MIN_VALUE);
        resultFigure.setColor(defaultColor);
        return resultFigure;
    }

    private int getRandomLength() {
        return random.nextInt(MIN_VALUE,MAX_VALUE);
    }
}
