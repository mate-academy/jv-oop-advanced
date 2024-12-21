package core.basesyntax;

import core.basesyntax.Figure;

public class Square extends Figure {

    // Figure: square, area: 25.0 sq. units, side: 5 units, color: blue

    private int side;

    public Square ( String color, int side ) {
        super ( color );
        this.side = side;
        setArea ( side*2);
    }


    @Override
    public void draw () {
        System.out.println ("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
        + side + " units, color: " + getColor ());
    }

    public int getSide () {
        return side;
    }

    public void setSide ( int side ) {
        this.side = side;
    }


}
