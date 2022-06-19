package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        int middleOfFigureArray = (int)figures.length / 2;
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < middleOfFigureArray) ? new FigureSupplier().getRandomFigure()
                                                  : new FigureSupplier().getDefaultFigure();
        }
        String str;
        for (Figure figure : figures) {
            str = figure.getClass().toString();
            switch (str) {
                case "class core.basesyntax.Circle":
                    ((Circle)figure).draw();
                    break;
                case "class core.basesyntax.IsoscelesTrapezoid":
                    ((IsoscelesTrapezoid)figure).draw();
                    break;
                case "class core.basesyntax.RightTriangle":
                    ((RightTriangle)figure).draw();
                    break;
                case "class core.basesyntax.Rectangle":
                    ((Rectangle)figure).draw();
                    break;
                case "class core.basesyntax.Square":
                    ((Square)figure).draw();
                    break;
                default:
                    System.out.println("Something goes wrong: class Main.");
            }
        }
    }
}
