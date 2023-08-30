package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIX_RADIUS = 10;
    private static final int MAX_NUMBER = 5;
    private static final int MAX_PARAMETR = 10;
    private static final String COLOR_WHITE = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_PARAMETR) + 1;
        int secondLeg = random.nextInt(MAX_PARAMETR) + 1;
        int radius = random.nextInt(MAX_PARAMETR) + 1;
        int height = random.nextInt(MAX_PARAMETR) + 1;
        switch (random.nextInt(MAX_NUMBER)) {
            case 0:
                return new Circle(color, radius);
            case 1:
                return new IsoscelesTrapezoid(color, firstLeg, secondLeg, height);
            case 2:
                return new Rectangle(color, firstLeg, secondLeg);
            case 3:
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                return new Square(color, firstLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_WHITE, FIX_RADIUS);
    }
}
