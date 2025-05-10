package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        double randomNumber1 = Math.floor(Math.random() * 1000 * 100) / 100.0;
        double randomNumber2 = Math.floor(Math.random() * 1000 * 100) / 100.0;
        double randomNumber3 = Math.floor(Math.random() * 1000 * 100) / 100.0;
        switch (figureNumber) {
            case 0:
                return new Circle(randomNumber1, color);
            case 1:
                return new Square(randomNumber1, color);
            case 2:
                return new Rectangle(randomNumber1, randomNumber2, color);
            case 3:
                return new RightTriangle(randomNumber1, randomNumber2, color);
            case 4:
                return new IsoscelesTrapezoid(randomNumber1,
                        randomNumber2, randomNumber3, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,Color.WHITE.name());
    }
}
