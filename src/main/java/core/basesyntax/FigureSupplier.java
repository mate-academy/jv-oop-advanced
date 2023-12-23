package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUES = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        switch (figureNumber) {
            case 1:
                int randomSide = random.nextInt(MAX_VALUES) + 1;
                return new Square(colorSupplier.getRandomColor(), randomSide);
            case 2:
                int randomWidth = random.nextInt(MAX_VALUES - 4) + 1;
                int randomHeight = random.nextInt(MAX_VALUES) + 3;
                return new Rectangle(colorSupplier.getRandomColor(), randomWidth, randomHeight);
            case 3:
                int randomFirstLeg = random.nextInt(MAX_VALUES - 4) + 1;
                int randomSecondLeg = random.nextInt(MAX_VALUES) + 1;
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomFirstLeg, randomSecondLeg);
            case 4:
                int randomRadius = random.nextInt(MAX_VALUES - 1) + 1;
                return new Circle(colorSupplier.getRandomColor(), randomRadius);
            case 5:
                int randomBaseA = random.nextInt(MAX_VALUES - 5) + 2;
                int randomBaseB = random.nextInt(MAX_VALUES - 2) + 4;
                randomHeight = random.nextInt(MAX_VALUES) + 1;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomBaseA, randomBaseB, randomHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        //Circle circleDefault = new Circle(MAX_VALUES);
        return new Circle("white", MAX_VALUES);
    }
}
