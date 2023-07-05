package core.basesyntax.tools;

import core.basesyntax.behaviour.FigureCreator;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier implements FigureCreator {
    public static final int COUNT_FIGURE = 5;
    public static final int DEFAULT_SIDE = 10;
    protected static final int MAX_SIDE_FIGURE = 14;

    private final ColorSupplier colorSupplierHelper = new ColorSupplier();
    private final Random randomHelper = new Random();

    @Override
    public Figure getRandomFigure() {
        int randomFigureCase = randomHelper.nextInt(COUNT_FIGURE);
        Color randomColor = colorSupplierHelper.getRandomColor(randomHelper);
        switch (randomFigureCase) {
            case 0:
                return new Circle("circle", randomColor, randomHelper.nextInt(MAX_SIDE_FIGURE) + 1);
            case 1:
                return new Square("square", randomColor, randomHelper.nextInt(MAX_SIDE_FIGURE) + 1);
            case 2:
                return new Rectangle("rectangle", randomColor,
                        randomHelper.nextInt(MAX_SIDE_FIGURE) + 1, randomHelper.nextInt(MAX_SIDE_FIGURE) + 1);
            case 3:
                return new RightTriangle("rightTriangle", randomColor,
                        randomHelper.nextInt(MAX_SIDE_FIGURE) + 1, randomHelper.nextInt(MAX_SIDE_FIGURE) + 1);
            case 4:
                return new IsoscelesTrapezoid("isoscelesTrapezoid", randomColor,
                        randomHelper.nextInt(MAX_SIDE_FIGURE) + 1, randomHelper.nextInt(MAX_SIDE_FIGURE) + 1);
            default:
                return getDefaultFigure();
        }
    }

    @Override
    public Figure getDefaultFigure() {
        return new Circle("circle",DEFAULT_SIDE, Color.WHITE);
    }
}
