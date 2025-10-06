package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        return switch (random.nextInt(5)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), random.nextInt(30));
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), random.nextInt(30),
                    random.nextInt(30));
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(30),
                    random.nextInt(30));
            case 3 -> new Square(colorSupplier.getRandomColor(), random.nextInt(30));
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(30),
                    random.nextInt(30), random.nextInt(30));
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
