package core.basesyntax;

import java.util.Random;

public class CircleStrategy implements FigureNameStrategy {
    @Override
    public Figure getFigure() {
        Random random = new Random();
        Figure figure = new Circle(random.nextDouble());
        figure.setColor(ColorSupplier.getRandomColor());
        return figure;
    }
}
