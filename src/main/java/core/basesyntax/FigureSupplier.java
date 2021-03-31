package core.basesyntax;

public class FigureSupplier {
    private final int numberOfFigures = 5;

    public static double getRandomProperties() {
        double max = 1.0;
        double min = 15.0;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Figure getRandomFigure() {
        int min = 1;
        int max = numberOfFigures;
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
