package core.basesyntax;

public class FigureSupplier {
    private static final Circle c = new Circle();
    private static final IsoscelesTrapezoid it = new IsoscelesTrapezoid();
    private static final Rectangle r = new Rectangle();
    private static final RightTriangle rt = new RightTriangle();
    private static final Square s = new Square();
    private static final String[] NUMBER_OF_FIGURES =
            {it.draw(), it.draw(), c.draw(), r.draw(), rt.draw(), s.draw()};

    public static double getRandomProperties() {
        double max = 1.0;
        double min = 15.0;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Figure getRandomFigure() {
        int min = 1;
        int max = NUMBER_OF_FIGURES.length;
        int randomNumber = (int) (Math.random() * (max - min)) + min;
        if (randomNumber == 1) {
            return new Circle();
        } else if (randomNumber == 2) {
            return new IsoscelesTrapezoid();
        } else if (randomNumber == 3) {
            return new Rectangle();
        } else if (randomNumber == 4) {
            return new RightTriangle();
        } else if (randomNumber == 5) {
            return new Square();
        } else {
            return null;
        }
    }
}
