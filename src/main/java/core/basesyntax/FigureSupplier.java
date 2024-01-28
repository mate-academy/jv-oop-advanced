package core.basesyntax;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_FIGURE_RADIUS = 10;
    public static final int NUMBER_FIGURE = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = (int) (Math.random() * NUMBER_FIGURE);
        String color = String.valueOf(colorSupplier.getRandomColor());

        switch (type) {
            case 0:
                return prepareSquare(color);
            case 1:
                return prepareRectangle(color);
            case 2:
                return prepareRightTriangle(color);
            case 3:
                return prepareCircle(color);
            case 4:
                return prepareIsoscelesTrapezoid(color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_FIGURE_RADIUS);
    }

    private Figure prepareSquare(String color) {
        double side = Math.random() * 10 + 1;
        return new Square(color, side);
    }

    private Figure prepareRectangle(String color) {
        double width = Math.random() * 10 + 1;
        double height = Math.random() * 10 + 1;
        return new Rectangle(color, width, height);
    }

    private Figure prepareRightTriangle(String color) {
        double firstLeg = Math.random() * 10 + 1;
        double secondLeg = Math.random() * 10 + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure prepareCircle(String color) {
        double radius = Math.random() * 10 + 1;
        return new Circle(color, radius);
    }

    private Figure prepareIsoscelesTrapezoid(String color) {
        double topBase = Math.random() * 10 + 1;
        double bottomBase = Math.random() * 10 + 1;
        double height2 = Math.random() * 10 + 1;
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height2);
    }
}
