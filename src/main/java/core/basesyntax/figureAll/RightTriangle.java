package core.basesyntax.figureAll;

import core.basesyntax.Figure;
import core.basesyntax.FigureOptions;

public class RightTriangle extends Figure implements FigureOptions {

   private double firstLeg;
   private double secondLeg;

   public RightTriangle(){}

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }


    @Override
    public double areaFigura() {
        return (firstLeg * secondLeg) * 0.5;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() + " unit sq., Length A=" + firstLeg + " unit sq., Length B= " + secondLeg + " unit sq.");
    }
}
