package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_COUNT = 5;
    static final int MAX_SIDE_A = 100;
    static final int MAX_SIDE_B = 100;
    static final int MAX_SIDE_C = 100;
    static final int MAX_RADIUS = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int sideA = random.nextInt(MAX_SIDE_A) + 1;
        int sideB = random.nextInt(MAX_SIDE_B) + 1;
        int sideC = random.nextInt(MAX_SIDE_C) + 1;
        int radius = random.nextInt(MAX_RADIUS) + 1;
        Figure randomFigure;

        switch (index) {
            case 0 :
                randomFigure = new Square(sideA, color);
                break;
            case 1 :
                randomFigure = new Rectangle(sideA, sideB, color);
                break;
            case 2 :
                randomFigure = new Circle(radius, color);
                break;
            case 3 :
                randomFigure = new RightTriangle(sideA, sideB, color);
                break;
            case 4 :
            default :
                randomFigure = new IsoscelesTrapezoid(sideA, sideB, sideC, color);
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
