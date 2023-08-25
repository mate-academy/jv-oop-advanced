package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final double RADIUS = 10.0;
    static final double MAX_NUMBER = 100.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(TypeOfFigure.values().length);
        TypeOfFigure type = TypeOfFigure.values()[index];
        String randomColor = colorSupplier.getRandomColor();
        switch (type) {
            case RECTANGLE:
                return new Rectangle(randomColor,
                        random.nextDouble() * MAX_NUMBER,random.nextDouble() * MAX_NUMBER);
            case CIRCLE:
                return new Circle(randomColor, random.nextDouble() * MAX_NUMBER);
            case SQUARE:
                return new Square(randomColor, random.nextDouble() * MAX_NUMBER);
            case TRIANGLE:
                return new RightTriangle(randomColor,
                        random.nextDouble() * MAX_NUMBER, random.nextDouble() * MAX_NUMBER);
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextDouble(), random.nextDouble() * MAX_NUMBER,
                        random.nextDouble() * MAX_NUMBER);
            default:
                return getDefaultFigure();
        }
    }
}
