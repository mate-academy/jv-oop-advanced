package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        //int index = this.random.nextInt(Figures.values().length);
        int index = this.random.nextInt(6);
        switch (index) {
            case 1:
                figure = new Circle();
                break;
            case 2:
                figure = new Rectangle();
                break;
            case 3:
                figure = new RightTriangle();
                break;
            case 4:
                figure = new IsoscelesTrapezoid();
                break;
            case 5:
                figure = new Square();
                break;
            default:
                figure = new RightTriangle();
                break;
        }
        figure.setRandomProperties();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Colors.White.name());
        circle.setRadius(10);
        return circle;
    }
}
