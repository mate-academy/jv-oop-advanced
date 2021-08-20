package core.basesyntax;

public class FigureSupplier {
    private static final int NUMBER_COUNT = 7;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();
        switch ((int) (Math.random() * FIGURE_COUNT)) {
            case (0):
                return new Square(randomColor, getRandomNumber());
            case (1):
                return new Rectangle(randomColor, getRandomNumber(), getRandomNumber());
            case (2):
                return new RightTriangle(randomColor, getRandomNumber(), getRandomNumber());
            case (3):
                return new Circle(randomColor, getRandomNumber());
            default:
                return new IsoscelesTrapezoid(randomColor, getRandomNumber(), getRandomNumber(),
                        getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return (int) (Math.random() * NUMBER_COUNT);
    }
}
