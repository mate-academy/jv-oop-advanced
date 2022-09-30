package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int defaultRadius = 10;

    public Figure getRandomFigure() {
        Rectangle randomRectangle = new Rectangle(new Random().nextInt(BOUND),
                new Random().nextInt(BOUND));
        randomRectangle.setColor(new ColorSupplier().getRandomColor());

        Square randomSquare = new Square(new Random().nextInt(BOUND));
        randomSquare.setColor(new ColorSupplier().getRandomColor());

        Circle randomCircle = new Circle(new Random().nextInt(BOUND));
        randomCircle.setColor(new ColorSupplier().getRandomColor());

        IsoscelesTrapezoid randomIsoscelesTrapezoid = new IsoscelesTrapezoid(new Random()
                .nextInt(BOUND), new Random().nextInt(BOUND),new Random().nextInt(BOUND));
        randomIsoscelesTrapezoid.setColor(new ColorSupplier().getRandomColor());

        RightTriangle randomRightTriangle = new RightTriangle(new Random().nextInt(BOUND),
                new Random().nextInt(BOUND));
        randomRightTriangle.setColor(new ColorSupplier().getRandomColor());

        String randomFigure = Figures.values()[new Random().nextInt(Figures.values().length)]
                .name();

        switch (randomFigure) {
            case "CIRCLE" :
                return randomCircle;
            case "SQUARE" :
                return randomSquare;
            case "RECTANGLE" :
                return randomRectangle;
            case "RIGHT_TRIANGLE" :
                return randomRightTriangle;
            default:
                return randomIsoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle(defaultRadius);
        defaultCircle.setColor("white");
        return defaultCircle;
    }
}
