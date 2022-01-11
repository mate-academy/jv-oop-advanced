package core.basesyntax;

public class FigureSupplier {
    Figures circle = new Circle();

    public Figures getRandomFigure() {

    }

    public Figures getDefaultFigure() {
        circle.setRadius(10);
        circle.setColor("WHITE");
        return circle;
    }
}
