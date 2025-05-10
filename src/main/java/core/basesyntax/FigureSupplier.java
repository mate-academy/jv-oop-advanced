package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNTER = 5;
    private static final int FIGURES_MAX = 30;

    private Random randomFigure = new Random();

    public Figure getRandomFigure() {
        int pickFigure = (new Random().nextInt(FIGURES_COUNTER));
        switch (pickFigure) {
            case 1:
                return new IsoscelesTrapezoid(new Random().nextInt(FIGURES_MAX),
                        new Random().nextInt(FIGURES_MAX),
                        new Random().nextInt(FIGURES_MAX),
                        ColorSupplier.choseColor(), "Isosceles Trapezoid");
            case 2:
                return new RightTriangle(new Random().nextInt(FIGURES_MAX),
                        new Random().nextInt(FIGURES_MAX),
                        ColorSupplier.choseColor(), "Right Triangle");
            case 3:
                return new Circle(new Random().nextInt(FIGURES_MAX),
                        ColorSupplier.choseColor(), "Circle");
            case 4:
                return new Rectangle(new Random().nextInt(FIGURES_MAX),
                        new Random().nextInt(FIGURES_MAX),
                        ColorSupplier.choseColor(), "Rectangle");
            default:
                return new Square(new Random().nextInt(FIGURES_MAX),
                        ColorSupplier.choseColor(), "Square");
        }
    }
}
