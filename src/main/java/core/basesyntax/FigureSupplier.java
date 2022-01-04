package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(5)) {
            case 1: {
                return getRandomCircle();
            }
            case 2: {
                return getRandomIsoscelesTrapezoid();
            }
            case 3: {
                return getRandomRectangle();
            }
            case 4: {
                return getRandomRightTriangle();
            }
            case 5: {
                return getRandomSquare();
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(10);

        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int firstParallelSide = random.nextInt(10);
        int secondParallelSide = random.nextInt(10);
        int height = random.nextInt(10);

        return new IsoscelesTrapezoid(color, firstParallelSide, secondParallelSide, height);
    }

    public Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(10);
        int secondLeg = random.nextInt(10);

        return new Rectangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(10);
        int secondLeg = random.nextInt(10);

        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(10);

        return new Square(color, side);
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();

        return new Circle(color, 10);
    }
}
