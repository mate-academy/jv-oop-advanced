package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 15;

    public Figure generateFigure() {

        switch ((int) Math.random() * FIGURE_NUMBER + 1) {
            case 1:
                return new Circle(ColorSupplier.getColour(),
                        (int) Math.random() * FIGURE_NUMBER + 1);
            case 2:
                return new Square(ColorSupplier.getColour(),
                        (int) Math.random() * FIGURE_NUMBER + 1);
            case 3:
                return new RightTriangle(ColorSupplier.getColour(),
                        (int) Math.random() * FIGURE_NUMBER + 1);
            case 4:
                return new Rectangle(ColorSupplier.getColour(),
                        (int) Math.random() * FIGURE_NUMBER + 1,
                        (int) Math.random() * FIGURE_NUMBER + 1);
            case 5:
                return new IsoscelesTrapezoid(ColorSupplier.getColour(),
                        (int) Math.random() * FIGURE_NUMBER + 1,
                        (int) Math.random() * FIGURE_NUMBER + 1);
            default:
                return new Circle(ColorSupplier.getColour(),
                        (int) Math.random() * FIGURE_NUMBER + 1);
        }
    }
}
