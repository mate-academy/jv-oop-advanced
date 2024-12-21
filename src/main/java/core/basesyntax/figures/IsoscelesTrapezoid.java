package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {

    private int height;
    private int base;
    private int side;

    public IsoscelesTrapezoid ( String color, int height, int base, int side ) {
        super ( color );
        this.height = height;
        this.base = base;
        this.side = side;
        setArea ( (height*base) + side * 0.5 );
    }


    @Override
    public void draw () {
        System.out.println ("Figure: " + getName() + ", area: " + getArea() + " sq. units, height: "
                + height + " units, base: " + base + " units, side" + side + " units, color: " + getColor ());
    }
}
