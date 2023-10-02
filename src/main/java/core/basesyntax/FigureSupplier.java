package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);

        double side = random.nextDouble() * 20 + 1;
        double length = random.nextDouble() * 20 + 1;
        double width = random.nextDouble() * 20 + 1;
        double firstLeg = random.nextDouble() * 20 + 1;
        double secondLeg = random.nextDouble() * 20 + 1;
        double radius = random.nextDouble() * 20 + 1;
        double topBase = random.nextDouble() * 20 + 1;
        double bottomBase = random.nextDouble() * 20 + 1;
        double legs = random.nextDouble() * 20 + 1;

        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(side, color);
            case 1:
                return new Rectangle(length, width, color);
            case 2:
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                return new Circle(radius, color);
            case 4:
                return new IsoscelesTrapezoid(topBase, bottomBase, legs, color);
            default:
                return new Circle(10, "white");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
