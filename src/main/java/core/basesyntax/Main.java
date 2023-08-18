package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure circle1 = new Circle("Circle1", "red",5);
        circle1.getFigure();
        Figure square1 = new Square("Square1", "green", 4);
        square1.getFigure();
        Figure rectangle1 = new Rectangle("Rectangle1","dark",3, 7);
        rectangle1.getFigure();

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        defaultFigure.getFigure();

        Figure randomFigure = figureSupplier.getRandomFigure();
        randomFigure.getFigure();
    }

}
