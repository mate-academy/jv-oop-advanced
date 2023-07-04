package core.basesyntax.tools;

import core.basesyntax.behaviour.FigureCreation;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier implements FigureCreation {
    public static final int COUNT_FIGURE = 5;
    public static final int DEFAULT_SIDE = 10;

    private final ColorSupplier colorSupplierHelper = new ColorSupplier();
    private final Random randomHelper = new Random();

    @Override
    public Figure getRandomFigure() {
        int randomFigureCase = randomHelper.nextInt(COUNT_FIGURE);
        Color randomColor = colorSupplierHelper.getRandomColor(randomHelper);
        switch (randomFigureCase) {
            case 0:
                return new Circle("circle", randomColor);
            case 1:
                return new Square("square", randomColor);
            case 2:
                return new Rectangle("rectangle", randomColor);
            case 3:
                return new RightTriangle("rightTriangle", randomColor);
            case 4:
                return new IsoscelesTrapezoid("isoscelesTrapezoid", randomColor);
            default:
                return getDefaultFigure();
        }
    }

    @Override
    public Figure getDefaultFigure() {
        return new Circle("circle",DEFAULT_SIDE, Color.WHITE);
    }
}
