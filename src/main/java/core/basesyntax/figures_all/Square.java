package core.basesyntax.figures_all;
import core.basesyntax.Figure;
import core.basesyntax.AreaCalculator;
public class Square extends Figure implements AreaCalculator {

     private double firstline;

     public Square() {}

    public Square(double firstline) {
        this.firstline = firstline;
    }

    public Square(String name, String color, double firstline) {
        super(name, color);
        this.firstline = firstline;
    }

    @Override
    public double areaFigura() {
        return firstline * firstline;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() +
                " unit sq., Length A=" + firstline + " unit sq.");
    }
}
