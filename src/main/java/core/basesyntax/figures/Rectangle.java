package core.basesyntax.figures;

public class Rectangle extends Figure{

    private int side1;

    private int side2;

    public Rectangle ( String color, int side1, int side2 ) {
        super ( color );
        this.side1 = side1;
        this.side2 = side2;
        setArea ( side1*side2 );

    }

    public int getSide1 () {
        return side1;
    }

    public void setSide1 ( int side1 ) {
        this.side1 = side1;
    }

    public int getSide2 () {
        return side2;
    }

    public void setSide2 ( int side2 ) {
        this.side2 = side2;
    }

    @Override
    public void draw () {
        System.out.println ("Figure: " + getName() + ", area: " + getArea() + " sq. units, side1: "
                + side1 + " units, side2: " + side2 + " units, color: " + getColor ());
    }
}
