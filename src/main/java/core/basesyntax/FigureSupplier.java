package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final double MIN_SIDE = 1.0;
    private static final double MAX_SIDE = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();

    }

    public Figure getDefaultFigure() {
        double radius = 10;
        String color = "WHITE";
        return new Circle(radius, color);
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case 0:
                double side = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                return new Square(side,color);
            case 1:
                double topBase = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                double bottomBase = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                double height = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
            case 2:
                double length = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                double width = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                return new Rectangle(length, width, color);
            case 3:
                double firstLeg = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                double secondLeg = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 4:
                double radius = random.nextDouble() * MAX_SIDE + MIN_SIDE;
                return new Circle(radius, color);
            default:
                return getDefaultFigure();
        }
    }

}
