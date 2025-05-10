package core.basesyntax;

import java.util.Random;

public class SquareStrategy implements FigureNameStrategy {
    @Override
    public Figure getFigure() {
        Random random = new Random();
        Figure figure = new Square(random.nextDouble());
        figure.setColor(ColorSupplier.getRandomColor());
        return figure;
    }
}
