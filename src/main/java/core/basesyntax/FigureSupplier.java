package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int numbersOfFigures;
    private Figure randomCircle = new Circle(colorSupplier.getRandomColor(), random.nextInt(100));
    private Figure randomTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100));
    private Figure randomRectangle = new Rectangle(colorSupplier.getRandomColor(),
            random.nextInt(100), random.nextInt(100));
    private Figure randomTriangle = new RightTriangle(colorSupplier.getRandomColor(),
            random.nextInt(100));
    private Figure randomSquare = new Square(colorSupplier.getRandomColor(),
            random.nextInt(100));

    public FigureSupplier(int numbersOfFigures) {
        this.numbersOfFigures = numbersOfFigures;
    }

    public Figure getRandomFigure() {

        switch (random.nextInt(6)) {
            case 0:
                return getRandomCircle();
            case 1 :
                return getRandomTrapezoid();
            case 2 :
                return getRandomRectangle();
            case 3 :
                return getRandomTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getRandomCircle() {
        return randomCircle;
    }

    public Figure getRandomTrapezoid() {
        return randomTrapezoid;
    }

    public Figure getRandomRectangle() {
        return randomRectangle;
    }

    public Figure getRandomTriangle() {
        return randomTriangle;
    }

    public Figure getRandomSquare() {
        return randomSquare;
    }

    public Figure getDefaultFigure() {
        String color = "WHITE";
        double radiusDefault = 10;
        return new Circle(color, radiusDefault);
    }
}
