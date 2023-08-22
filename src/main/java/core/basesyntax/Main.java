package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures1 = new Figure[3];
        for (int i = 0; i < figures1.length / 2; i++) {
            Figure figures = new FigureSupplier().getRandomFigure();
            figures.draw2();
        }

        System.out.println("___________________________________________");

        for (int i = 0; i < figures1.length / 2; i++) {
            Figure figures2 = new FigureSupplier().getDefaultFigure1();
            figures2.draw();
        }
    }
}
