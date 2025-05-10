package core.basesyntax;

public class FigureSupplier {
    private static final int NUMBER_OF_FOGURES = 6;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch ((int) (Math.random() * NUMBER_OF_FOGURES)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 2:
                return new Trapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 5:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomDouble());
            default:
                return getRandomFigure();
        }
    }

    private double getRandomDouble() {
        return Math.round(Math.random() * 100000) / 100.0;
    }
}
