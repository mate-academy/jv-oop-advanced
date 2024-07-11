package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private int range = 40;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final String[] figures = {"square",
            "rectangle",
            "righttriangle",
            "circle",
            "isoscelestrapezoid"};
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(figures.length);
        String figure = figures[randomFigureIndex];

        if (figure.equals("square")) {
            Figure square = new Square(random.nextInt(range), colorSupplier.getRandomColor());
            return square;
        } else if (figure.equals("rectangle")) {
            Figure rectangle = new Rectangle(random.nextInt(range),
                    random.nextInt(range),
                    colorSupplier.getRandomColor());
            return rectangle;
        } else if (figure.equals("righttriangle")) {
            Figure triangle = new RightTriangle(random.nextInt(range),
                    random.nextInt(range),
                    colorSupplier.getRandomColor());
            return triangle;
        } else if (figure.equals("circle")) {
            Figure circle = new Circle(random.nextInt(range), colorSupplier.getRandomColor());
            return circle;
        } else if (figure.equals("isoscelestrapezoid")) {
            Figure trapezoid = new IsoscelesTrapezoid(random.nextInt(range),
                    random.nextInt(range),
                    random.nextInt(range),
                    colorSupplier.getRandomColor());
            return trapezoid;
        }

        return null;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10, "white");
        return circle;
    }
}
