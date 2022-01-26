package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid("BLUE", 9, 3);
        Figure circle = new Circle("PINK", 2);
        Figure rectangle = new Rectangle("GREEN", 8,4);

        Figure[] allFigure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < allFigure.length; i++) {
            if (i == 0) {
                allFigure[i] = isoscelesTrapezoid;
            } else if (i == 1) {
                allFigure[i] = circle;
            } else if (i == 2) {
                allFigure[i] = rectangle;
            } else {
                allFigure[i] = figureSupplier.getRandomFigure();
            }

            System.out.println(allFigure[i].draw());
        }
    }
}
