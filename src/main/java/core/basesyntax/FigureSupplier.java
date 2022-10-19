package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_FIGURES = 5;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int n = random.nextInt(1,AMOUNT_FIGURES + 1);
        return switch(n) {
            case 1 -> new Square(colorSupplier.getRandomColor(), random.nextInt(100));
            case 2 -> new Circle(colorSupplier.getRandomColor(), random.nextInt(100));
            case 3 -> new Rectangle(colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(100));
            case 4 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(100));
            case 5 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(100), random.nextInt(100));
            default -> null;
        };
    }

    public Figure getDefaultFigure(){
        return new Circle(colorSupplier.getRandomColor(), 10);
    }
}
