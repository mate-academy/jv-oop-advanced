package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int minfigures = 5;
    private final double defaultvalue = 10;
    private final String defaultcolor = "white";
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int choice = random.nextInt(minfigures);
        switch (choice) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10
                        + 1, colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble() * 10 + 1, random.nextDouble()
                        * 10 + 1, colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble() * 10
                        + 1, colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10 + 1, random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultvalue, defaultcolor);
    }
}


