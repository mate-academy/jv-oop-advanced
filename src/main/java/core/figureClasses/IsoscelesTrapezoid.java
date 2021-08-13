package core.figureClasses;

import core.interfaces.AreaCalculator;
import core.interfaces.Draw;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Draw {
    private int height;
    private int firstOppositeSide;
    private int secondOppositeSide;

    public IsoscelesTrapezoid(String name, String color, int height, int firstOppositeSide, int secondOppositeSide) {
        super(name, color);
        this.firstOppositeSide = firstOppositeSide;
        this.secondOppositeSide = secondOppositeSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (firstOppositeSide + secondOppositeSide) / 2 * height;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: " + this.name + ", area: " + area() + " sq.units, height: " + height +
                " units, first opposite side: " + firstOppositeSide + " units, second opposite side: " +
                secondOppositeSide + " units, color: " + this.color);
    }
}
