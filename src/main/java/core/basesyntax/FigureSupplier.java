package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int figuresCounter = 5;
    private static final int figuresMax = 30;

    private Random randomFigure = new Random();

    public Figure getRandomFigure() {
        int pickFigure = (new Random().nextInt(figuresCounter));
        switch (pickFigure) {
            case 1:
                return new IsoscelesTrapezoid(new Random().nextInt(figuresMax),
                        new Random().nextInt(figuresMax),
                        new Random().nextInt(figuresMax),
                        ColorSupplier.choseColor(), "Isosceles Trapezoid");
            case 2:
                return new RightTriangle(new Random().nextInt(figuresMax),
                        new Random().nextInt(figuresMax),
                        ColorSupplier.choseColor(), "Right Triangle");
            case 3:
                return new Circle(new Random().nextInt(figuresMax),
                        ColorSupplier.choseColor(), "Circle");
            case 4:
                return new Rectangle(new Random().nextInt(figuresMax),
                        new Random().nextInt(figuresMax),
                        ColorSupplier.choseColor(), "Rectangle");
            default:
                return new Square(new Random().nextInt(figuresMax),
                        ColorSupplier.choseColor(), "Square");
        }
    }
}
