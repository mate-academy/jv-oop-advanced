package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int figureType = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Colors color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0 :
                double radius = 1 + random.nextDouble() * 20;
                return new Circle(color.name(), radius);
            case 1 :
                double side = 1 + random.nextDouble() * 20;
                return new Square(color.name(), side);
            case 2 :
                double firstLeg = 1 + random.nextDouble() * 5;
                double secondLeg = 1 + random.nextDouble() * 5;
                return new Rectangle(color.name(), firstLeg, secondLeg);
            case 3 :
                double firstLine = 1 + random.nextDouble() * 3;
                double secondLine = 1 + random.nextDouble() * 3;
                return new RightTriangle(color.name(), firstLine, secondLine);
            case 4 :
                double leg1 = 1 + random.nextDouble() * 4;
                double leg2 = 1 + random.nextDouble() * 4;
                double heigh = 1 + random.nextDouble() * 4;
                return new IsoscelesTrapezoid(color.name(), leg1, leg2, heigh);
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
