package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    int a = random.nextInt(10 + 1);
    int b = random.nextInt(10 + 1);
    int h = random.nextInt(10 + 1);
    ColorSupplier color = new ColorSupplier();
    //String randomColor = color.getRandomColor();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index){
            case 0:
                return new Circle(a, color.getRandomColor());
            case 1:
                return new Square(a, color.getRandomColor());
            case 2:
                return new Rectangle(a, b, color.getRandomColor());
            case 3:
                return new RightTriangle(a, b, color.getRandomColor());
            default:
                return new IsoscelesTrapezoid(a, b, h, color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
        return circle;
    }
}
