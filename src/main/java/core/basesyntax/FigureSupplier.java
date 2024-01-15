package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomInrex = random.nextInt(5);
        switch (randomInrex) {
            case 0:
                return new Circle(Math.random(), colorSupplier.getRandomColor());
            case 1:
                return new Square(Math.random(), colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTapezoid(Math.random(), Math.random(), Math.random(),
                        Math.random(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(Math.random(), Math.random(),
                        colorSupplier.getRandomColor());
            default:
                return new Rectangle(Math.random(), Math.random(), colorSupplier.getRandomColor());
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
