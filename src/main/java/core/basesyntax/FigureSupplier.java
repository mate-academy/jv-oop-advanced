package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                String randomColorForSquare = supplier.getRandomColor();
                int randomValueForSquare = random.nextInt(50) + 1;
                return new Square(randomColorForSquare, randomValueForSquare);
            case 1:
                String randomColorForCircle = supplier.getRandomColor();
                int randomValueForCircle = random.nextInt(50) + 1;
               return new Circle(randomColorForCircle, randomValueForCircle);
            case 2:
                String randomColorForRectangle = supplier.getRandomColor();
                int randomValueForRectangleLegOne = random.nextInt(50) + 1;
                int randomValueForRectangleLegTwo = random.nextInt(50) + 1;
                return new Rectangle(randomColorForRectangle, randomValueForRectangleLegOne, randomValueForRectangleLegTwo);
            case 3:
                String randomColorForRightRectangle = supplier.getRandomColor();
                int randomValueForFirstSide = random.nextInt(50) + 1;
                int randomValueForSecondSide = random.nextInt(50) + 1;
               return new RightRectangle(randomColorForRightRectangle, randomValueForFirstSide, randomValueForSecondSide);
            case 4:
                String randomColorForIsoscelesTrapezoid = supplier.getRandomColor();
                int randomValueUpperBase = random.nextInt(50) + 1;
                int randomValueLowerCase = random.nextInt(50) + 1;
                int randomValueForHeight = random.nextInt(50) + 1;
                return new IsoscelesTrapezoid(randomColorForIsoscelesTrapezoid, randomValueUpperBase, randomValueLowerCase, randomValueForHeight);
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
       return new Circle("White", 10);
    }

}
