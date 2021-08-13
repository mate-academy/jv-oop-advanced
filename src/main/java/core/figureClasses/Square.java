package core.figureClasses;

import core.interfaces.AreaCalculator;
import core.interfaces.Draw;

public class Square extends Figure{
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: " + this.name + ", area: " + area() + " sq.units, side: " + side + " units, color: "
                + this.color);
    }
}
