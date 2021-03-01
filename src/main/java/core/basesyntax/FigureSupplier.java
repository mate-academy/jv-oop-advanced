package core.basesyntax;

public class FigureSupplier extends RandomNumber {
    private String[] figureList =
            new String[]{"Circle", "Rectangle", "Square", "RightTriangle", "IsoscelesTrapezoid"};
    private String figure;

    private String getRandomFigure() {
        return getProperty(figureList);
    }

    public Figure getFigureProperty() {
        figure = getRandomFigure();

        switch (figure) {
            case "Circle":
                return new Circle((int) getRandomNumber(10));
            case "Rectangle":
                return new Rectangle((int) getRandomNumber(10), (int) getRandomNumber(10));
            case "Square":
                return new Square((int) getRandomNumber(10));
            case "Right Triangle":
                return new RightTriangle((int) getRandomNumber(10), (int) getRandomNumber(10));
            default:
                return new IsoscelesTrapezoid(
                        (int) getRandomNumber(10),
                        (int) getRandomNumber(10),
                        (int) getRandomNumber(10)
                );
        }
    }
}
