package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random rand = new Random();
    private static final double max = 100;
    private static final double min = 5;
    private static final int randomForFigures = 5;

    public Figure hetRandomFigure() {
        int randomIndexForFigure = rand.nextInt(randomForFigures);
        ColorSupplier color = new ColorSupplier();
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
        return (Math.floor(Math.random() * (max - min + 1) + min));
    }
}


