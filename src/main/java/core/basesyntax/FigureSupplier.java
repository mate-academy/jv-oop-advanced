package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RADIUS_DEFAULT = 10;
    private static final String COLOR_DEFAULT = "White";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getDefaultFigure() {
        return new Circle(RADIUS_DEFAULT, COLOR_DEFAULT);
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();
        double sideA = new Random().nextInt(MAX_SIZE);
        double sideB = new Random().nextInt(MAX_SIZE);
        double sideC = new Random().nextInt(MAX_SIZE);
        switch (index) {
            case 1:
                return new Square(sideA, color);
            case 2:
                return new Rectangle(sideA, sideB, color);
            case 3:
                return new RightTriangle(sideA, sideB, color);
            case 4:
                return new Circle(sideA, color);
            default:
                return new IsoscelesTrapezoid(sideA, sideB, sideC, color);

        }
    }

}
