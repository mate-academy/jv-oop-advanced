package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final ColorSupplier colorSupplier = new ColorSupplier();
    static final int maxParameterValue = 50;
    static final int FIGURES_COUNT = 5;
    static final Random random = new Random();
    static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        double side = new Random().nextInt(maxParameterValue);
        double width = new Random().nextInt(maxParameterValue);
        double height = new Random().nextInt(maxParameterValue);
        double radius = new Random().nextInt(maxParameterValue);
        double base = new Random().nextInt(maxParameterValue);
        double firstLeg = new Random().nextInt(maxParameterValue);
        double secondLeg = new Random().nextInt(maxParameterValue);
        int value = random.nextInt(FIGURES_COUNT);
        switch (value) {
            case 0:
                return new Square(color, side);
            case 1:
                return new Rectangle(color, width, height);
            case 2:
                return new Circle(color, radius);
            case 3:
                return new IsoscelesTrapezoid(color, base, height);
            default:
                return new RightTriangle(color, firstLeg, secondLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getValue(), DEFAULT_RADIUS);
    }
}
