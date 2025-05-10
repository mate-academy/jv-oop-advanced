package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure(int mode) {
        Figure figure;
        switch(mode) {
            case 0: figure = new Circle(random.nextDouble());
                    break;
            case 1: figure = new IsoscelesTrapezoid(random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
                    break;
            case 2: figure = new Rectangle(random.nextDouble(), random.nextDouble());
                    break;
            case 3: figure = new RightTriangle(random.nextDouble(), random.nextDouble());
                    break;
            case 4: figure = new Square(random.nextDouble());
                    break;
            default: figure = new Circle(10);
        }
        figure.color = colorSupplier.getRandomColor();
        return figure;
    }
    public Figure getDefaultFigure() {
        Figure figure = new Circle(10);
        figure.color = "WHITE";
        return figure;
    }
}
