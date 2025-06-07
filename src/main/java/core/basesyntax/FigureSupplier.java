package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                double width = getRandomDouble();
                double height = getRandomDouble();
                return new Rectangle(color, width, height);
            case 1:
                double firstLeg = getRandomDouble();
                double secondLeg = getRandomDouble();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 2:
                double side = getRandomDouble();
                return new Square(color, side);
            case 3:
                double radius = getRandomDouble();
                return new Circle(color, radius);
            case 4:
                double base1 = getRandomDouble();
                double base2 = getRandomDouble();
                double trapHeight = getRandomDouble();
                return new IsoscelesTrapezoid(color, base1, base2, trapHeight);
            default:
                return getDefaultFigure();
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
    
    private double getRandomDouble() {
        return 1 + random.nextDouble() * 19;
    }
}
