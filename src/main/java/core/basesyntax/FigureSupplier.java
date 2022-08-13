package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int MAX_INT = 25;
    private static final Figure DEF_CIRCLE = new Circle();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = {new Rectangle(), new RightTriangle(), new Circle(), new Square(), new IsoscelesTrapezoid()};

        Figure figure = figures[random.nextInt(figures.length)];
        if (figure instanceof Rectangle) {
            figure.setColor(colorSupplier.getRandomColor());
            ((Rectangle) figure).setFirstLeg(random.nextInt(MAX_INT) + 1);
            ((Rectangle) figure).setSecondLeg(random.nextInt(MAX_INT) + 1);
        } else if (figure instanceof RightTriangle) {
            ((RightTriangle) figure).setFirstLeg(random.nextInt(MAX_INT) + 1);
            ((RightTriangle) figure).setSecondLeg(random.nextInt(MAX_INT) + 1);
        } else if (figure instanceof IsoscelesTrapezoid) {
            ((IsoscelesTrapezoid) figure).setFirstLeg(random.nextInt(MAX_INT) + 1);
            ((IsoscelesTrapezoid) figure).setSecondLeg(random.nextInt(MAX_INT) + 1);
            ((IsoscelesTrapezoid) figure).setThirdLeg(random.nextInt(MAX_INT) + 1);
        } else if (figure instanceof Square) {
            ((Square) figure).setFirstLeg(random.nextInt(MAX_INT) + 1);
        } else if (figure instanceof Circle) {
            ((Circle) figure).setRadius(random.nextInt(MAX_INT) + 1);
        }

        figure.setColor(colorSupplier.getRandomColor());

        return figure;
    }

    public Figure getDefaultFigure() {
        return DEF_CIRCLE;
    }
}
