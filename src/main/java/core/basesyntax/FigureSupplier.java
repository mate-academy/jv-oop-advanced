package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final int MAX_VALUE = 100;

    private int getRandomNumber(int maxValue) {
        return (int) (1 + Math.random() * maxValue);
    }

    public Figure getRandomFigure() {
        switch (getRandomNumber(FIGURES_AMOUNT)) {
            case 1:
                return new RightTriangle(getRandomNumber(MAX_VALUE),
                        getRandomNumber(MAX_VALUE),
                        new ColorSupplier().getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(getRandomNumber(MAX_VALUE),
                        getRandomNumber(MAX_VALUE),
                        getRandomNumber(MAX_VALUE),
                        new ColorSupplier().getRandomColor());
            case 3:
                return new Rectangle(getRandomNumber(MAX_VALUE),
                        getRandomNumber(MAX_VALUE),
                        new ColorSupplier().getRandomColor());
            case 4:
                return new Square(getRandomNumber(MAX_VALUE), new ColorSupplier().getRandomColor());
            case 5:
                return new Circle(getRandomNumber(MAX_VALUE), new ColorSupplier().getRandomColor());
            default:
                throw new IllegalStateException("Unexpected value: "
                                                 + getRandomNumber(FIGURES_AMOUNT));
        }
    }
}
