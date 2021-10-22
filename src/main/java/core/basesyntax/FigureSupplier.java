package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_COUNT = 5;
    static final int MAX_SIDE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int sideA;
        int sideB;
        int sideC;
        int radius;

        switch (index) {
            case 0 :
                sideA = random.nextInt(MAX_SIDE) + 1;
                return new Square(sideA, color);
            case 1 :
                sideA = random.nextInt(MAX_SIDE) + 1;
                sideB = random.nextInt(MAX_SIDE) + 1;
                return new Rectangle(sideA, sideB, color);
            case 2 :
                radius = random.nextInt(MAX_SIDE) + 1;
                return new Circle(radius, color);
            case 3 :
                sideA = random.nextInt(MAX_SIDE) + 1;
                sideB = random.nextInt(MAX_SIDE) + 1;
                return new RightTriangle(sideA, sideB, color);
            case 4 :
            default :
                sideA = random.nextInt(MAX_SIDE) + 1;
                sideB = random.nextInt(MAX_SIDE) + 1;
                sideC = random.nextInt(MAX_SIDE) + 1;
                return new IsoscelesTrapezoid(sideA, sideB, sideC, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
