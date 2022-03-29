package core.basesyntax;

import java.util.Random;

public class RightTriangleStrategy implements FigureNameStrategy {
    @Override
    public Figure getFigure() {
        Random random = new Random();
        Figure figure = new RightTriangle(random.nextDouble(), random.nextDouble());
        figure.setColor(ColorSupplier.getRandomColor());
        return figure;
    }
}
