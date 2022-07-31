package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int index = 1 + random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 1 :
                figure = new Circle();
                figure.info();
                break;
            case 2 :
                figure = new IsoscelesTrapezoid();
                figure.info();
                break;
            case 3 :
                figure = new Rectangle();
                figure.info();
                break;
            case 4 :
                figure = new RightTriangle();
                figure.info();
                break;
            case 5:
                figure = new Square();
                figure.info();
                break;
            default: getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setFigureName("circle");
        circle.setRadius(10);
        circle.setColor(String.valueOf(Colors.WHITE));
        System.out.println("Figure: " + circle.getFigureName() + ", " + "area: " + circle.getArea()
                + " sq.units, radius: " + circle.getRadius() + ", color: " + circle.getColor());
        return circle;
    }

}
