package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {
        FigureType[] figureTypes = FigureType.values();
        FigureType randomFigureType = figureTypes[random.nextInt(figureTypes.length)];
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        int randomNumber3 = random.nextInt(100);
        Figure figure = getDefaultFigure();

        switch (randomFigureType) {
            case CIRCLE:
                figure = new Circle(randomNumber1, colorSupplier.getRandomColor());
                break;
            case SQUARE:
                figure = new Square(randomNumber1, colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(randomNumber1, randomNumber2, colorSupplier.getRandomColor());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(randomNumber1, randomNumber2, colorSupplier.getRandomColor());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(randomNumber1,
                        randomNumber2,
                        randomNumber3,
                        colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }
}
