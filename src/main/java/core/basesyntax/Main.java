package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int length = (int) (Math.random() * 25 + 1);
        Figure[] figures = new Figure[length];

        System.out.println("TAKE FREE " + length + " FIGURES, WITHOUT ANY MASSAGE OR REGISTRATION\n"
                        + "----------------------------------------------------------");
        for (int i = 0; i < length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
            figures[i].drawFigure();
        }
    }
}
