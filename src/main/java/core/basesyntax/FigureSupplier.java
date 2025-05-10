package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color COLOR_OF_DEFAULT_FIGURE = Color.WHITE;
    private static final int RADIUS_OF_DEFAULT_CIRCLE = 10;
    private static final int MAX_VALUE_FOR_FIGURE_PROPERTY = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure randomFigure;
        Color randomColor = colorSupplier.getRandomColor();
        int numberOfRandomFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (numberOfRandomFigure) {
            case 0:
                int randomSide = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                randomFigure = new Square(randomColor, randomSide);
                break;
            case 1:
                int randomLength = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                int randomWidth = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                randomFigure = new Rectangle(randomColor, randomLength, randomWidth);
                break;
            case 2:
                int randomFirstLeg = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                int randomSecondLeg = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                randomFigure = new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
                break;
            case 3:
                int randomRadius = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                randomFigure = new Circle(randomColor, randomRadius);
                break;
            default:
                int randomFirstBase = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                int randomSecondBase = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                int randomHeight = random.nextInt(MAX_VALUE_FOR_FIGURE_PROPERTY);
                randomFigure = new IsoscelesTrapezoid(
                        randomColor, randomFirstBase, randomSecondBase, randomHeight);
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_DEFAULT_FIGURE, RADIUS_OF_DEFAULT_CIRCLE);
    }
}
