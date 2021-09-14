package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private int randomLimit = 11;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public void setName(Random newRandom) {
        this.random = newRandom;
    }

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
        int radius = random.nextInt(randomLimit);
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Figure generateRandomIsoscelesTrapezoid() {
        int side1 = random.nextInt(randomLimit);
        int side2 = random.nextInt(randomLimit);
        int height = random.nextInt(randomLimit);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, side1, side2, height);
    }

    private Figure generateRandomSquare() {
        int side = random.nextInt(randomLimit);
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Figure generateRandomRectangle() {
        int side1 = random.nextInt(randomLimit);
        int side2 = random.nextInt(randomLimit);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, side1, side2);
    }

    private Figure generateRandomRightTriangle() {
        int firstLeg = random.nextInt(randomLimit);
        int secondLeg = random.nextInt(randomLimit);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

}
