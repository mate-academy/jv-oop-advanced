package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure result;

    public Figure getRandomFigure() {
        int figureCount = 5;
        int index = random.nextInt(figureCount);
        Color color = colorSupplier.getRandomColor();
        switch (index) {
            case 0 : // Square
                double side = random.nextDouble();
                result = new Square(color,side);
                break;
            case 1 : // Triangle
                double firstLeg = random.nextDouble();
                double secondLeg = random.nextDouble();
                result = new Triangle(color,firstLeg,secondLeg);
                break;
            case 2 : // Rectangle
                double sideRectA = random.nextDouble();
                double sideRectB = random.nextDouble();
                result = new Rectangle(color, sideRectA, sideRectB);
                break;
            case 3: // Circle
                double radius = random.nextDouble();
                result = new Circle(color, radius);
                break;
            default: // IsoscelesTrapezoid
                double sideTrapezoidA = random.nextDouble();
                double sideTrapezoidB = random.nextDouble();
                double perpendicular = random.nextDouble();
                result = new IsoscelesTrapezoid(
                        color, sideTrapezoidA, sideTrapezoidB, perpendicular);
        }
        return result;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
