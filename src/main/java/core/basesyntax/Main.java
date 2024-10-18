package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        var supplierFigure = new FigureSupplierImpl();
        var supplierColor = new ColorSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < array.length / 2; i++) {
            var figure = supplierFigure.getRandomFigure();
            figure.setColor(supplierColor.getRandomColor());
            array[i] = figure;
        }
        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = supplierFigure.getDefaultFigure();
        }
        for (Figure figure : array) {
            System.out.println(figure);
        }
    }
}
