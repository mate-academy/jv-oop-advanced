package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 1000;
    private Random random = new Random();
    private int side = random.nextInt(MAX_SIDE);
    private ColorSupplier color = new ColorSupplier();

    public Figures defaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor("WHITE");
        defaultCircle.setRadius(10);
        return defaultCircle;
    }

    public Figures getRandomFigure() {
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
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(side, side, side);
                trapezoid.setColor(color.getRandomColor());
                figureInstance = trapezoid;
                break;
            case (2):
                Rectangle rectangle = new Rectangle(side, side);
                rectangle.setColor(color.getRandomColor());
                figureInstance = rectangle;
                break;
            case (3):
                RightTriangle triangle = new RightTriangle(side, side);
                triangle.setColor(color.getRandomColor());
                figureInstance = triangle;
                break;
            case (4):
                Square square = new Square(side);
                square.setColor(color.getRandomColor());
                figureInstance = square;
                break;
            default:
                figureInstance = new FigureSupplier().defaultFigure();
                break;
        }
        return figureInstance;
    }
}
