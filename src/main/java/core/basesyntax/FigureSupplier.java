package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final Random randomNumber = new Random();
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int TEN_NUMBER = 10;
    private static final int ONE_NUMBER = 1;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public Figure getRandomFigure() {
        int indexOfColor = random.nextInt(NUMBER_OF_FIGURES);
        Figure randomFigure = null;
        switch (indexOfColor) {
            case 1: {
                randomFigure = new Square(randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        colorSupplier.getRandomColor());
                break;
            }
            case 2: {
                randomFigure = new Rectangle(randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        colorSupplier.getRandomColor());
                break;
            }
            case 3: {
                randomFigure = new RightTriangle(
                        randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        colorSupplier.getRandomColor());
                break;
            }
            case 4: {
                randomFigure = new Circle(randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        colorSupplier.getRandomColor());
                break;
            }
            case 5: {
                randomFigure = new IsoscelesTrapezoid(
                        randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        randomNumber.nextDouble() * TEN_NUMBER + ONE_NUMBER,
                        colorSupplier.getRandomColor());
                break;
            }
            default: {
                return figureSupplier.getDefaultFigure();
            }
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(TEN_NUMBER, "white");
    }
}
