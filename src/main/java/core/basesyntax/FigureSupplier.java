package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure(){

        return null;
    }
    public Figure getDefaultFigure(){
        Figure defaultCircle = new Circle(10);
        defaultCircle.color = Color.WHITE;
        return defaultCircle;
    }
}
