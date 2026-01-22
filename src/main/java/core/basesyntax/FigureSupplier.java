package core.basesyntax;

public class FigureSupplier {

    public Behavior getDefaultFigure(){
        return new Circle(Colors.WHITE.toString(), 10);
    }
}
