package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BORDER = 30;
    public static final String COLOR_Default = "WHITE";
    public static final double RADIUS_Default = 10;
    public static final String CIRCLE_Default = "circle";
    public static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return new RightTriangle("right triangle",
                        supplier.getRandomColor(),
                        random.nextInt(BORDER), random.nextInt(BORDER));
            case 1:
                return new Rectangle("rectangle",
                        supplier.getRandomColor(),
                        random.nextInt(BORDER), random.nextInt(BORDER));
            case 2:
                return new Square("square",
                        supplier.getRandomColor(), random.nextInt(BORDER));
            case 3:
                return new Circle("circle",
                        supplier.getRandomColor(), random.nextInt(BORDER));
            default:
                return new Trapezoid("isosceles trapezoid",
                        supplier.getRandomColor(), random.nextInt(BORDER),
                        random.nextInt(BORDER), random.nextInt(BORDER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_Default, COLOR_Default,RADIUS_Default);
    }
}
