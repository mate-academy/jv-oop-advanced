package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOR = "White";
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0 : {
                figure = new Square(colorSupplier.getRandomColor(),
                        randomNumber + 10);
                break;
            }
            case 1 : {
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        (double)randomNumber + 10,
                        (double)randomNumber + 11);
                break;
            }
            case 2 : {
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        (double)randomNumber + 10,
                        (double)randomNumber + 11);
                break;
            }
            case 3 : {
                figure = new Circle(colorSupplier.getRandomColor(),
                        (double)randomNumber + 10);
                break;
            }
            case 4 : {
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        (double)randomNumber + 10,
                        (double)randomNumber + 11,
                        (double)randomNumber + 12);
                break;
            }
            default: {
                figure = new Square(colorSupplier.getRandomColor(),
                        randomNumber + 10);
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, 10.0);
    }
}
