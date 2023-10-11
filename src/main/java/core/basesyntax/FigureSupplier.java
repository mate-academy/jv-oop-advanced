package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final String[] listFigure = new String[]
            {"Circle", "Square", "Rectangle", "RightTriangle", "IsoscelesTrapezoid"};

    public Figure getRandomFigure() {
        String randomFigure = listFigure[random.nextInt(listFigure.length)];
        int randomRange = 100;
        switch (randomFigure) {
            case "Circle":
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange));
            case "Square":
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange));
            case "Rectangle":
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange));
            case "RightTriangle":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange));
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(),10);
    }

}
