package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE = 10;
    private static final int MAX_SIZE = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        double side = random.nextInt(MAX_SIZE);
        double height = random.nextInt(MAX_SIZE);
        double width = random.nextInt(MAX_SIZE);
        double firstLeg = random.nextInt(MAX_SIZE);
        double secondLeg = random.nextInt(MAX_SIZE);
        double radius = random.nextInt(MAX_SIZE);
        double base1 = random.nextInt(MAX_SIZE);
        double base2 = random.nextInt(MAX_SIZE);

        switch (figureNumber) {
            case 0 : return new Square(color, side);
            case 1 : return new Rectangle(color, height, width);
            case 2 : return new RightTriangle(color, firstLeg, secondLeg);
            case 3 : return new Circle(color, radius);
            case 4 : return new IsoscelesTrapezoid(color, base1, base2, height);
            default : return new IsoscelesTrapezoid(color, base1, base2, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", SIZE);
    }
}
