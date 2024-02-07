package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 7;
    public static final int MAX_SIZE_RANDOM_NUMBER = 10;
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int number) {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1: return getRandomCircle();
            case 2: return getRandomRectangle();
            case 3: return getRandomSquare();
            case 4: return getRandomIsoscelesTrapezoid();
            default: return getRandomRightTriangle();
        }
    }

    public RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        int randomSecondLeg = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        String randomColor = colorSupplier.getRandomColor();
        return new RightTriangle(FigureName.TRIANGLE.name(), randomColor,randomFirstLeg,
                randomSecondLeg);
    }

    public Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        String randomColor = colorSupplier.getRandomColor();
        return new Circle(FigureName.CIRCLE.name(), randomColor, randomRadius);
    }

    public Square getRandomSquare() {
        int randomSide = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        String randomColor = colorSupplier.getRandomColor();
        return new Square(FigureName.SQUARE.name(), randomColor, randomSide);
    }

    public Rectangle getRandomRectangle() {
        int randomFirstSide = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        int randomSecondSide = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        String randomColor = colorSupplier.getRandomColor();
        return new Rectangle(FigureName.RECTANGLE.name(), randomColor,randomFirstSide,
                randomSecondSide);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomTopBasis = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        int randomBottomBasis = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        int randomLateralSide = random.nextInt(MAX_SIZE_RANDOM_NUMBER + 1);
        String randomColor = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(FigureName.TRAPEZOID.name(), randomColor,
                randomTopBasis, randomBottomBasis, randomLateralSide);
    }

    public Circle getDefaultFigure() {
        return new Circle(FigureName.CIRCLE.name(), Color.WHITE.name(), 10);
    }
}
