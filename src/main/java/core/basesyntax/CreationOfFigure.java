package core.basesyntax;

public class CreationOfFigure extends FigureSupplier {
    public static void main(String[] args) {
        CreationOfFigure firstFigure = new CreationOfFigure();
        CreationOfFigure secondFigure = new CreationOfFigure();
        CreationOfFigure thirdFigure = new CreationOfFigure();
        CreationOfFigure fourthDefaultFigure = new CreationOfFigure();
        CreationOfFigure[] figures = new CreationOfFigure[]{firstFigure, secondFigure, thirdFigure};
        for (CreationOfFigure i : figures) {
            i.getRandomFigure().printInfoAboutFigures();
        }
        fourthDefaultFigure.getDefaultFigure().printInfoAboutFigures();
    }
}
