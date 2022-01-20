package core.basesyntax;

import java.util.Random;

//square, rectangle, right triangle, circle, isosceles trapezoid
public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int MAX_LENGTH = 30;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int size1 = random.nextInt(MAX_LENGTH);
        int size2 = random.nextInt(MAX_LENGTH);
        int size3 = random.nextInt(MAX_LENGTH);
        String randomColor = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                randomFigure = new Square(size1, randomColor);
                break;
            case 2:
                randomFigure = new Rectangle(size1, size2, randomColor);
                break;
            case 3:
                randomFigure = new RightTriangle(size1, size2, randomColor);
                break;
            case 4:
                randomFigure = new Circle(size1, randomColor);
                break;
            default:
                randomFigure = new IsoscelesTrapezoid(size1, size2, size3, randomColor);
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.toString().toLowerCase());
    }
}
