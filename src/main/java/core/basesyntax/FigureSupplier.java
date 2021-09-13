package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    // Getter
    public Random getRandom() {
        return random;
    }

    // Setter
    public void setName(Random newRandom) {
        this.random = newRandom;
    }

    // generate random number for 0 to figureCount

    public Figure getRandomFigure() {
        int figureChoice = random.nextInt(5);
        switch (figureChoice) {
            case 0:
                return generateRandomCircle();
            case 1:
                return generateRandomIsoscelesTrapezoid();
            case 2:
                return generateRandomSquare();
            case 3:
                return generateRandomRectangle();
            case 4:
                return generateRandomRightTriangle();
            default:
                return getRandomFigure();
        }
    }

    private Figure generateRandomCircle() {
        int radius = random.nextInt(11);
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Figure generateRandomIsoscelesTrapezoid() {
        int side1 = random.nextInt(11);
        int side2 = random.nextInt(11);
        int height = random.nextInt(11);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, side1, side2, height);
    }

    private Figure generateRandomSquare() {
        int side = random.nextInt(11);
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Figure generateRandomRectangle() {
        int side1 = random.nextInt(11);
        int side2 = random.nextInt(11);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, side1, side2);
    }

    private Figure generateRandomRightTriangle() {
        int firstLeg = random.nextInt(11);
        int secondLeg = random.nextInt(11);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

}
