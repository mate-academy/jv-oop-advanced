package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final int MAX_VALUE = 100;

    private int getRandomNumber(int figuresAmount) {
        return (int) (1 + Math.random() * figuresAmount);
    }

    private int getRandomNumber() {
        return (int) (1 + Math.random() * MAX_VALUE);
    }

    public Figure getRandomFigure() {
        switch (getRandomNumber(FIGURES_AMOUNT)) {
            case 1:
                return new RightTriangle(getRandomNumber(),
                        getRandomNumber(),
                        new ColorSupplier().getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber(),
                        new ColorSupplier().getRandomColor());
            case 3:
                return new Rectangle(getRandomNumber(),
                        getRandomNumber(),
                        new ColorSupplier().getRandomColor());
            case 4:
                return new Square(getRandomNumber(), new ColorSupplier().getRandomColor());
            case 5:
                return new Circle(getRandomNumber(), new ColorSupplier().getRandomColor());
            default:
                throw new IllegalStateException("Unexpected value: "
                                                 + getRandomNumber(FIGURES_AMOUNT));
        }
    }
}
