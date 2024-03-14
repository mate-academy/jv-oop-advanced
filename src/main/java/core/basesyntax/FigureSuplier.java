package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int NUMBER_COUNT = 10;
    private static final int FIGURE_COUNT = 10;
    private static final double DEAFAULT_RADIUS = 10.0;
    private final ColorSuplier colorSuplier;
    private Random random = new Random();

    public FigureSuplier(ColorSuplier colorSuplier) {
        this.colorSuplier = colorSuplier;
    }

    public Figure getRandomFigure() {
        int randomFigureType = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSuplier.getRandomColor();

        switch (randomFigureType) {
            case 0:
                double randomRadius = random.nextDouble() * NUMBER_COUNT;
                return new Circle(randomColor, randomRadius);
            case 1:
                double randomSmallerSide = random.nextDouble() * NUMBER_COUNT;
                double randomBiggerSide = random.nextDouble() * NUMBER_COUNT;
                double randomHeight = random.nextDouble() * NUMBER_COUNT;
                return new IsoscelesTrapezoid(randomColor, randomSmallerSide, randomBiggerSide,
                        randomHeight);
            case 2:
                double randomHeightRectangle = random.nextDouble() * NUMBER_COUNT;
                double randomWidth = random.nextDouble() * NUMBER_COUNT;
                return new Rectangle(randomColor, randomHeightRectangle, randomWidth);
            case 3:
                double randomFirstLeg = random.nextDouble() * NUMBER_COUNT;
                double randomSecondLeg = random.nextDouble() * NUMBER_COUNT;
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            case 4:
                double randomSide = random.nextDouble() * NUMBER_COUNT;
                return new Square(randomColor, randomSide);
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", DEAFAULT_RADIUS);
    }
}
