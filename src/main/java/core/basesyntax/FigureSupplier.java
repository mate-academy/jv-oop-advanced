package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        Figure figure = new Figure();
        if (index == 0) {

            Circle circle = new Circle();
            circle.setRadius(random.nextInt(100));
            circle.setColor(supplier.getRandomColor());
            figure = circle;
        }
        if (index == 1) {

            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(random.nextInt(100));
            rectangle.setHeight(random.nextInt(100));
            rectangle.setColor(supplier.getRandomColor());
            figure = rectangle;
        }
        if (index == 2) {
            Square square = new Square();
            square.setSide(random.nextInt(100));
            square.setColor(supplier.getRandomColor());
            figure = square;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("White");
        return circle;
    }
}
