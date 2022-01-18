import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int COLOR_COUNT = 8;
    public static final int MAX_SIDE = 50;
    private Random random = new Random();

    // Why not to cut this decision? ->
    // Color of figure is a state of each and every figure,
    // so it can be seen as something, that exists beneath figure,
    // and it's possible to include ColorSupplier as a subclass of FigureSupplier.
    // Or not?
    // Also, we don't create redundant files.
    private class ColorSupplier {
        public String getRandomColor() {
            int index = random.nextInt(COLOR_COUNT);
            return Colors.values()[index].toString();
        }
    }

    public Figure getRandomFigure() {
        Figure figure;
        int index = random.nextInt(FIGURE_COUNT);
        switch (EnumOfFigures.values()[index]) {
            case CIRCLE:
                figure = new Circle(getRandomSide());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(getRandomSide(), getRandomSide());
                break;
            case SQUARE:
                figure = new Square(getRandomSide());
                break;
            case RECTANGLE:
                figure = new Rectangle(getRandomSide(), getRandomSide());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(getRandomSide(), getRandomSide(), getRandomSide());
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        figure.setColor(new ColorSupplier().getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("White");
        return circle;
    }

    private double getRandomSide() {
        return random.nextInt(MAX_SIDE);
    }
}
