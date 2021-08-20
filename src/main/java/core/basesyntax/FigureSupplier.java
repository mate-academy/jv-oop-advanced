package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX = 100;
    private static final double MIN = 5;
    private static final int RANDOM_FOR_FIGURES = 5;
    private Random rand = new Random();

    public Figure hetRandomFigure() {
        int randomIndexForFigure = rand.nextInt(RANDOM_FOR_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor().toString();
        switch (RANDOM_FOR_FIGURES) {
            case 0:
                return new Circle(getRandomFigureParameter(), randomColor);
            case 1:
                return new IsoscelesTrapezoid(getRandomFigureParameter(), getRandomFigureParameter(),
                        getRandomFigureParameter(), randomColor);
            case 2:
                return new Rectangle(getRandomFigureParameter(), getRandomFigureParameter(), randomColor);
            case 3:
                return new Square(getRandomFigureParameter(), randomColor);
            default:
                return new RightTriangle(getRandomFigureParameter(), getRandomFigureParameter(), randomColor);
        }
    }

    private double getRandomFigureParameter() {
        return (Math.floor(Math.random() * (MAX - MIN + 1) + MIN));
    }
}
