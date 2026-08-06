package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 0 -> {
                return new Circle(getRandomColor(), random.nextDouble());
            }
            case 1 -> {
                return new IsoscelesTrapezoid(getRandomColor(), random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble());
            }
            case 2 -> {
                return new Rectangle(getRandomColor(), random.nextDouble(), random.nextDouble());
            }
            case 3 -> {
                return new RightTriangle(getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            }
            case 4 -> {
                return new Square(getRandomColor(), random.nextDouble());
            }
            default -> System.out.println("There's no object");
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
