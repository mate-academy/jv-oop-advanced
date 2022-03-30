package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(),"Circle", randomNumber);
            case 1 :
                return new Square(colorSupplier.getRandomColor(),"Square", randomNumber);
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(),"Rectangle", randomNumber);
            case 3 :
                return new RightTriangle(colorSupplier.getRandomColor(), "RightTriangle",
                        randomNumber, randomNumber);
            case 4 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        "IsoscelesTrapezoid", randomNumber, randomNumber, randomNumber);
            default:
                return new FigureSupplier().getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), "Circle", 10);
    }
}
