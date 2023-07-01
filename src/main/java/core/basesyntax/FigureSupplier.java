package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RADIUS = 10;
    private Random random = new Random();
    private Circle circle = new Circle(Colors.WHITE.name(), RADIUS);

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
            switch (figureNumber) {
                case 0:
                    Circle circle = new Circle(new ColorSupplier().getRandomColor(), new Random().nextInt(10) + 1);
                    return circle;
                case 1:
                    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),new Random().nextInt(10) + 1,new Random().nextInt(10) + 1,new Random().nextInt(10) + 1);
                    return isoscelesTrapezoid;
                case 2:
                    Rectangle rectangle = new Rectangle(new ColorSupplier().getRandomColor(),new Random().nextInt(10) + 1,new Random().nextInt(10) + 1);
                    return rectangle;
                case 3:
                    RightTriangle rightTriangle = new RightTriangle(new ColorSupplier().getRandomColor(),new Random().nextInt(10) + 1,new Random().nextInt(10) + 1);
                    return rightTriangle;
                case 4:
                    Square square = new Square(new ColorSupplier().getRandomColor(), new Random().nextInt(10) + 1);
                    return square;
            }
            return null;
    }
    public Figure getDefaultFigure() {
        return circle;
    }
}
