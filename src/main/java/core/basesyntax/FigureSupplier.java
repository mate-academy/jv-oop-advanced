package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int randomFigure = random.nextInt(5) + 1;
        switch (randomFigure) {
            case 1:
                return new Circle(Math.random() * 10, colorSupplier.getRandomColor());
            case 2:
                return new Square(Math.random() * 10, colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(Math.random() * 10,
                        Math.random() * 10,
                        colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(Math.random() * 10,
                        Math.random() * 10,
                        colorSupplier.getRandomColor());
            case 5:
                return new IsoscelesTrapezoid(Math.random() * 10, colorSupplier.getRandomColor());
            default:
                break;
        }
        return null;
    }
}
