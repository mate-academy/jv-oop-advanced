package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOR = "White";
    private static final int RADIUS = 10;
    private static final int NUMBER_FIGURE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        double number = random.nextDouble();
        switch (random.nextInt(NUMBER_FIGURE)) {
            case 0 :
                return new Square(color, number);
            case 1 :
                return new Circle(color, number);
            case 2 :
                return new RightTriangle(color, number, number);
            case 3 :
                return new IsoscelesTrapezoid(color, number, number, number);
            case 4 :
                return new Rectangle(color, number, number);
            default :
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }
}
