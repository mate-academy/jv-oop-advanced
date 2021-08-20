package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Circle(getRandomNumber(), colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(getRandomNumber(),
                        getRandomNumber(), getRandomNumber(),
                        colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new Rectangle(getRandomNumber(), getRandomNumber(),
                        colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(getRandomNumber(), getRandomNumber(),
                        colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new Square(getRandomNumber(), colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }

    private double getRandomNumber() {
        return random.nextInt(10);
    }
}
