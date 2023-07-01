package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);
        double param1 = random.nextDouble() * 10;
        double param2 = random.nextDouble() * 10;
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color, param1);
            case 1:
                return new Rectangle(color, param1, param2);
            case 2:
                return new RightTriangle(color, param1, param2);
            case 3:
                return new Circle(color, param1);
            case 4:
                return new IsoscelesTrapezoid(color, param1, param2, param1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
