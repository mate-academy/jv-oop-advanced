package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure result = new Circle(Color.WHITE, 10);;
        switch (figureNumber) {
            case 1:
                Circle circle = new Circle(Color.RED, 7);
                circle.draw();
                break;
            case 2:
                Rectangle rectangle = new Rectangle(9, 5, Color.GREEN);
                rectangle.draw();
                break;
            case 3:
                RightTriangle righttriangle = new RightTriangle(Color.BLUE, 4, 12);
                righttriangle.draw();
                break;
            case 4:
                Square square = new Square(39, Color.ORANGE);
                square.draw();
                break;
            case 5:
                IsoscelesTrapezoid isoscelestrapezoid = new IsoscelesTrapezoid(Color.YELLOW, 18, 22, 45);
                isoscelestrapezoid.draw();
                break;
                default:
                    Circle circle1 = new Circle(Color.WHITE, 10);
                    circle1.draw();
        }
        return result;
    }

    public Figure getDefaultFigure() {
        Circle circle1 = new Circle(Color.WHITE, 10);
        circle1.draw();
        return circle1;
    }
}
