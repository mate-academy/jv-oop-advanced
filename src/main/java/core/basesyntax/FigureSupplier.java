package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {

    }
    public Figure getDefaultFigure() {
        Circle figure = new Circle();
        figure.color = "white";
        figure.radius = 10;
        return figure;
    }
}
