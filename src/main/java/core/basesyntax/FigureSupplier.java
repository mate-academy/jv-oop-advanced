package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return generateRandomCircle();
            case 1:
                return generateRandomSquare();
            case 2:
                return generateRandomRectangle();
            case 3:
                return generateRandomRightTriangle();
            default:
                return generateRandomIsoscelesTrapezoid();
        }
    }

    public Figure generateRandomCircle() {
        double radius = random.nextInt(50);
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private Figure generateRandomSquare() {
        double side = random.nextInt(50);
        String color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }

    private Figure generateRandomRectangle() {
        double firstSide = random.nextInt(50);
        double secondSide = random.nextInt(50);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(firstSide, secondSide, color);
    }

    private Figure generateRandomRightTriangle() {
        double firstLeg = random.nextInt(50);
        double secondLeg = random.nextInt(50);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure generateRandomIsoscelesTrapezoid() {
        double upSide = random.nextInt(20);
        double downSide = random.nextInt(50);
        double height = random.nextInt(30);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(upSide, downSide, height, color);
    }
}
