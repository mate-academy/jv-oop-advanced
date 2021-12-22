package model;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[5];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure f: figure) {
            f.draw();
        }
    }
}

/*створити об*єкт ColorSupplier
ColorSupplier supplier = new ColorSupplier();
System.out.println(supplier.getRandomColorOfFigure);
 */
