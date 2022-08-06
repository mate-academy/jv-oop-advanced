package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 1 :
                figure = new Circle().setRandomCircle();
                figure.getInfo();
                break;
            case 2 :
                figure = new IsoscelesTrapezoid().setRandomIsoscelesTrapezoid();
                figure.getInfo();
                break;
            case 3 :
                figure = new Rectangle().setRandomRectangle();
                figure.getInfo();
                break;
            case 4 :
                figure = new RightTriangle().setRandomRightTriangle();
                figure.getInfo();
                break;
            default:
                figure = new Square().setRandomSquare();
                figure.getInfo();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setFigureName("circle");
        circle.setRadius(10);
        circle.setColor(String.valueOf(Colors.WHITE));
        return circle;
    }
}
