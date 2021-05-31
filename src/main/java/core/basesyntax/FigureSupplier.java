package core.basesyntax;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch ((int) (Math.random() * 6)) {
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

    // The method gives a beautiful value rounded to the hundredths
    private double getRandomDouble() {
        return Math.round(Math.random() * 100000) / 100.0;
    }
}
