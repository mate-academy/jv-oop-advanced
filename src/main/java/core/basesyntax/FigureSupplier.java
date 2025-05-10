package core.basesyntax;

public class FigureSupplier {
    public static final int RANDOM_LIMIT = 342;
    public static final int FIGURE_VARIETY = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureIndex = (int) (Math.random() * FIGURE_VARIETY);

        switch (figureIndex) {
            case 1: Figure randomSquare = new Square("square",
                    colorSupplier.getRandomColor(), (int) (Math.random() * RANDOM_LIMIT));
                    return randomSquare;
            case 2: Figure randomRightTriangle = new RightTriangle("right triangle",
                    colorSupplier.getRandomColor(), (int) (Math.random() * RANDOM_LIMIT));
                    return randomRightTriangle;
            case 3: Figure randomRectangle = new Rectangle("rectangle",
                    colorSupplier.getRandomColor(), (int) (Math.random() * RANDOM_LIMIT),
                    (int) (Math.random() * RANDOM_LIMIT));
                    return randomRectangle;
            case 4: Figure randomIsoscelesTrapezoid = new IsoscelesTrapezoid("isosceles trapezoid",
                    colorSupplier.getRandomColor(), (int) (Math.random() * RANDOM_LIMIT),
                    (int) (Math.random() * RANDOM_LIMIT), (int) (Math.random() * RANDOM_LIMIT));
                    return randomIsoscelesTrapezoid;
            default: Figure randomCircle = new Circle("circle", colorSupplier.getRandomColor(),
                    (int) (Math.random() * RANDOM_LIMIT));
                    return randomCircle;
        }
    }
}
