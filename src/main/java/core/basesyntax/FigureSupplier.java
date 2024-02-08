package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String colorName = colorSupplier.getRandomColor();
        Random random = new Random();
        int choice = random.nextInt(5);
        return switch (choice) {
            case 0 -> new Square(colorName, random.nextDouble() * 10 + 1);
            case 1 -> new Rectangle(colorName, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 2 -> new RightTriangle(colorName, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 3 -> new Circle(colorName, random.nextDouble() * 10 + 1);
            case 4 -> new IsoscelesTrapezoid(colorName, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
