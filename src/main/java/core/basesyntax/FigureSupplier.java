package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                int squareSide = random.nextInt(10) + 1;
                return new Square(squareSide, figureColor);
            case 2:
                int rectFirstSide = random.nextInt(10) + 1;
                int rectSecondSide = random.nextInt(10) + 1;
                return new Rectangle(rectFirstSide,rectSecondSide, figureColor);
            case 3:
                int triFirstLeg = random.nextInt(10) + 1;
                int triSecondLeg = random.nextInt(10) + 1;
                return new RightTriangle(triFirstLeg, triSecondLeg, figureColor);
            case 4:
                int circleRadius = random.nextInt(10) + 1;
                return new Circle(circleRadius, figureColor);
            default:
                int trapFirstBase = random.nextInt(10) + 11;
                int trapSecondBase = random.nextInt(10) + 1;
                int trapSide = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(trapFirstBase, trapSecondBase,trapSide, figureColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name().toLowerCase());
    }
}
