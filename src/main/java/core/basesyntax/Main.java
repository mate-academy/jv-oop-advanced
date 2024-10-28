package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            System.out.println(figureSupplier.getRandomFigure().infoFromRigure());

            System.out.println(figureSupplier.getDefaultFigure().infoFromRigure());
        }
    }
}
