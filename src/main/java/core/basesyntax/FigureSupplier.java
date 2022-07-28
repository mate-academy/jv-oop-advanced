package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        // generate a specific figure based on the `figureNumber` value
        int number = (int) (Math.random() * FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        Figure randomFigure = new Circle(10);
        double randomNumber1 = Math.floor(Math.random() * 1000 * 100) / 100.0;
        double randomNumber2 = Math.floor(Math.random() * 1000 * 100) / 100.0;
        double randomNumber3 = Math.floor(Math.random() * 1000 * 100) / 100.0;
        switch (number) {
            case 0:
                randomFigure = new Circle(randomNumber1, color);
                break;
            case 1:
                randomFigure = new Square(randomNumber1, color);
                break;
            case 2:
                randomFigure = new Rectangle(randomNumber1, randomNumber2, color);
                break;
            case 3:
                randomFigure = new RightTriangle(randomNumber1, randomNumber2, color);
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid(randomNumber1,
                        randomNumber2, randomNumber3, color);
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10);
    }
}
