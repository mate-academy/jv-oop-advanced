package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle ( String color, int radius ) {
        super ( color );
        this.radius = radius;
        setArea ( Math.pow ( radius, 2 ) );
    }


    public int getRadius () {
        return radius;
    }

    public void setRadius ( int radius ) {
        this.radius = radius;
    }

    @Override
    public void draw () {
        System.out.println ("Figure: " + getName() + ", area: " + getArea() + " sq. units, radius: "
                + radius + " units,  color: " + getColor ());
    }
}
