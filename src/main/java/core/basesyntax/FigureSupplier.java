package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 1000;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();


    public Figures defaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor("WHITE");
        defaultCircle.setRadius(10);
        return defaultCircle;
    }

    public Figures GetRandomFigure() {
        int randomIndex = random.nextInt(5);
        Figures figureInstance;

        switch (randomIndex) {
            case (0):
                Circle circle = new Circle();
                circle.setColor(color.getRandomColor());
                circle.setRadius(random.nextInt(MAX_SIDE));
                figureInstance = circle;
                break;
            case (1):
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
                trapezoid.setColor(color.getRandomColor());
                figureInstance = trapezoid;
                break;
            case (2):
                Rectangle rectangle = new Rectangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
                rectangle.setColor(color.getRandomColor());
                figureInstance = rectangle;
                break;
            case (3):
                RightTriangle triangle = new RightTriangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
                triangle.setColor(color.getRandomColor());
                figureInstance = triangle;
                break;
            case (4):
                Square square = new Square(random.nextInt(MAX_SIDE));
                square.setColor(color.getRandomColor());
                figureInstance = square;
                break;
            default:
                figureInstance = new FigureSupplier().defaultFigure();
                break;
        }

    }
}
