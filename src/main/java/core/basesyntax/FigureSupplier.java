package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LOWWER_BOUND = 1;
    private static final int UPPER_BOUND = 101;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private Figure figure;
    private Random number = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int bounds = (UPPER_BOUND - LOWWER_BOUND) + LOWWER_BOUND;
        switch (number.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(),
                                        number.nextInt(bounds));
                break;
            case 1:
                figure = new Square(colorSupplier.getRandomColor(),
                                        number.nextInt(bounds));
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                                        number.nextInt(bounds),
                                        number.nextInt(bounds));
                break;
            case 3:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                        number.nextInt(bounds),
                                        number.nextInt(bounds),
                                        number.nextInt(bounds));
                break;
            case 4:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                                        number.nextInt(bounds),
                                        number.nextInt(bounds));
                break;
            default:
                System.out.println("ops something goes wrong");
                break;
        }
        return figure;
    }

}
