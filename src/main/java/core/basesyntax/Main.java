package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        // get random color
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println(colorSupplier.getRandomColor());

        // get random figure
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getRandomFigure();
        randomFigure.getArea();
        randomFigure.draw();
    }
}
