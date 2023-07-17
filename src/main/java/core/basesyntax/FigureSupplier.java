package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNTER_FIGURE = 5;
    private final Random random = new Random();
    private final NumberSupplier numberSupplier = new NumberSupplier(random);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;

        int randomNumber = random.nextInt(COUNTER_FIGURE);
        switch (randomNumber) {
            case 0 :
                figure = new Circle(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber());
                break;
            case 1 :
                figure = new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateFirstRandomNumberForTrapezoid(),
                        numberSupplier.generateSecondRandomNumberForTrapezoid());
                break;
            case 2 :
                figure = new Rectangle(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber(),
                        numberSupplier.generateRandomNumber());
                break;
            case 3 :
                figure = new RightTriangle(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber(),
                        numberSupplier.generateRandomNumber());
                break;
            case 4 :
                figure = new Square(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber());
                break;
            default:
                return getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
