package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random rand = new Random();
    private static final double MAX = 100;
    private static final double MIN = 5;
    private static final int RANDOM_FOR_FIGURES = 5;

    public Figure hetRandomFigure() {
        int randomIndexForFigure = rand.nextInt(RANDOM_FOR_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = color.getRandomColor().toString();

        switch (randomForFigures) {
            case 0:
                return new Circle(getRandomLeg(), randomColor);
            case 1:
                return new IsoscelesTrapezoid(getRandomLeg(), getRandomLeg(),
                        getRandomLeg(), randomColor);
            case 2:
                return new Rectangle(getRandomLeg(), getRandomLeg(), randomColor);
            case 3:
                return new Square(getRandomLeg(), randomColor);
            default:
                return new RightTriangle(getRandomLeg(), getRandomLeg(), randomColor);
        }
    }

    private double getRandomLeg() {
        return (Math.floor(Math.random() * (MAX - MIN + 1) + MIN));
    }
}


