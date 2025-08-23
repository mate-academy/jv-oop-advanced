package core.basesyntax;

public class FigureSupplier {

    public static Figure getRandomFigure(String color) {
        int type = (int) (Math.random() * 5);

        return switch (type) {
            case 0 -> new Square(color, Math.random());
            case 1 -> new Rectangle(color, Math.random(), Math.random());
            case 2 -> new RightTriangle(color, Math.random(), Math.random());
            case 3 -> new Circle(color, Math.random());
            case 4 -> new IsoscelesTrapezoid(color, Math.random(), Math.random(), Math.random());
            default -> null;
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
