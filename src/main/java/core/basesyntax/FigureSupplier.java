package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public static final int FigureCount = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Area getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FigureCount);
        switch (figureType) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(side, color);
            case 1:
                double length = random.nextDouble() * 10 + 1;
                double width = random.nextDouble() * 10 + 1;
                return new Rectangle(length, width, color);
            case 2:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(radius, color);
            case 4:
                double base1 = random.nextDouble() * 10 + 1;
                double base2 = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(base1, base2, height, color);
            default:
                return null;
        }
    }

    public final Area getDefaultFigure() {
        return new Circle(10, "White");
    }
}
