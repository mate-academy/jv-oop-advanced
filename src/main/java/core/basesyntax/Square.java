package core.basesyntax;

public class Square  extends AbstractFigure implements Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}

/*package core.basesyntax;

public class Square extends Figure {
    double side;
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }
    @Override 
     public double getArea() {
        return side * side;
     }
    @Override
    public void draw() {
        System.out.println("Figure : Square, area :" + getArea() 
        + " units, side : " + side + " units, color :" + color);
    }
}
*/
