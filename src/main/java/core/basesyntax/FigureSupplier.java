package core.basesyntax;

public class FigureSupplier {
    private ColorSupplier colors = new ColorSupplier();
    static final int FIGURE_COUNT = 6;
    static final int MAX_FACTOR = 10;

    public Figure getRandomFigure() {
        String color = colors.getRandomColor();
        double num = Math.ceil(Math.random() * FIGURE_COUNT);
        int count = (int) (Math.random() * FIGURE_COUNT);
        double side = Math.ceil(Math.random() * MAX_FACTOR);

        switch (count) {
            case 1:
                return new Square("Square", color, side);
            case 2:
                return new Rectangle("Rectangle", color, side, Math.abs(side - num));
            case 3:
                return new RightTriangle("RightTriangle", color, side);
            case 4:
                return new Circle("Circle", color, side);
            default:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", color, side, side + num, side);
        }
    }
}
