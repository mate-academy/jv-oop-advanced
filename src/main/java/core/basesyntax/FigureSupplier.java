package core.basesyntax;

public class FigureSupplier {

    public Figure getRandomFigure() {
        return null;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.radius = 10;
        circle.color = Color.WHITE.toString();
        return circle;
    }
}
