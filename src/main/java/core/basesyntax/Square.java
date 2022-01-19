package core.basesyntax;

public class Square extends Figure implements FigureProperties {
    private double side;


    @Override
    public String toString() {
        return "Figure: square. Side: " + side + ". Area: " + getArea() + ". Color: " + ;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
