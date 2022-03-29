package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoidStrategy implements FigureNameStrategy {
    @Override
    public Figure getFigure() {
        Random random = new Random();
        Figure figure = new IsoscelesTrapezoid(random.nextDouble(),
                random.nextDouble(), random.nextDouble());
        figure.setColor(ColorSupplier.getRandomColor());
        return figure;
    }
}
