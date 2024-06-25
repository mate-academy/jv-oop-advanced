package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEAFAULT_COLOR = Color.WHITE.name();
    private static final int RADIUS = 10;
    private static final int NUMBER_FIGURE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(NUMBER_FIGURE)) {
            case 0 :
                return new Square(color, random.nextDouble());
            case 1 :
                return new Circle(color, random.nextDouble());
            case 2 :
                return new RightTriangle(color, random.nextDouble(), random.nextDouble());
            case 3 :
                return new IsoscelesTrapezoid(color,
                        random.nextDouble(), random.nextDouble(), random.nextDouble());
            case 4 :
                return new Rectangle(color, random.nextDouble(), random.nextDouble());
            default :
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEAFAULT_COLOR, RADIUS);
    }
}
