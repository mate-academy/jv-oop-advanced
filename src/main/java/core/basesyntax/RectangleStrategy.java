package core.basesyntax;

import java.util.Random;

public class RectangleStrategy implements FigureNameStrategy {
    @Override
    public Figure getFigure() {
        Random random = new Random();
        Figure figure = new Rectangle(random.nextDouble(), random.nextDouble());
        figure.setColor(ColorSupplier.getRandomColor());
        return figure;
    }
}
