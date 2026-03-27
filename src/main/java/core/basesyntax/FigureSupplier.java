package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int index = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                double radius = random.nextDouble() * 10;
                return new Circle(color,radius);
            case 1:
                double base1 = random.nextDouble() * 10;
                double base2 = random.nextDouble() * 10;
                double height = random.nextDouble() * 10;
                return new IsoscelesTrapezoid(color, base1, base2, height);
            case 2:
                double length = random.nextDouble() * 10;
                double width = random.nextDouble() * 10;
                return new Rectangle(color, length, width);
            case 3:
                double leg1 = random.nextDouble() * 10;
                double leg2 = random.nextDouble() * 10;
                return new RightTriangle(color, leg1, leg2);
            case 4:
                double side = random.nextDouble() * 10;
                return new Square(color,side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
