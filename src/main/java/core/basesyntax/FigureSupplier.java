package core.basesyntax;

public class FigureSupplier {

    public static Figure getRandomFigure(String color) {
        int type = (int) (Math.random() * 5);

        return switch (type) {
            case 0 -> new Square(color, Math.random() * 10 + 1);
            case 1 -> new Rectangle(color, Math.random() * 10 + 1, Math.random() * 10 + 1);
            case 2 -> new RightTriangle(color, Math.random() * 10 + 1, Math.random() * 10 + 1);
            case 3 -> new Circle(color, Math.random() * 10 + 1);
            case 4 -> new IsoscelesTrapezoid(color, Math.random() * 10 + 1,
                    Math.random() * 10 + 1, Math.random() * 10 + 1);
            default -> null;
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
