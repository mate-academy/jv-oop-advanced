package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        String color = "White";
        int radius = 10;
        return new Circle("White", 10);
    }
}
