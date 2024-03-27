package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements AreaCalculate, Drawable{
    private int side;

    public Square(int side, String color){
        super(color);
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, side: " + side + ", area: " + getArea()
                + ", color: " + getColor());
    }
}
