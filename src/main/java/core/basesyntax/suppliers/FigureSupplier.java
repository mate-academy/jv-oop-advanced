package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (getRandomSize(FIGURE_COUNT)) {
            case 1: return getRandomCircle();
            case 2: return getRandomTrapezoid();
            case 3: return getRandomRectangle();
            case 4: return getRandomTriangle();
            case 5: return getRandomSquare();

            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private Figure getRandomCircle() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomRadius = getRandomSize(10);
        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomTrapezoid() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = getRandomSize(10);
        int randomSecondSide = getRandomSize(10);
        int randomHeight = getRandomSize(10);
        return new IsoscelesTrapezoid(randomColor, randomFirstSide, randomSecondSide, randomHeight);
    }

    private Figure getRandomRectangle() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = getRandomSize(10);
        int randomSecondSide = getRandomSize(10);
        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private Figure getRandomTriangle() {
        Color randomColor = colorSupplier.getRandomColor();
        int firstLeg = getRandomSize(10);
        int secondLeg = getRandomSize(10);
        return new RightTriangle(randomColor, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomSide = getRandomSize(10);
        return new Square(randomColor, randomSide);
    }

    private int getRandomSize(int maxInt) {
        return random.nextInt(maxInt) + 1;
    }
}
