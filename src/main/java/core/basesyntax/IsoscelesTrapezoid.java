package core.basesyntax;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {

    private int height;
    private int base1;
    private int base2;

    public IsoscelesTrapezoid ( String color, int height, int base1, int base2 ) {
        super ( color );
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
        setArea ( ((base1 + base2) / 2) * height);
    }


    @Override
    public void draw () {
        System.out.println ("Figure: " + getName() + ", area: " + getArea() + " sq. units, height: "
                + height + " units, base1: " + base1 + " units, base2 " + base2 + " units, color: " + getColor ());
    }
}
