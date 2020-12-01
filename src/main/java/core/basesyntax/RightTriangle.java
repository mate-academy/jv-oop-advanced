package core.basesyntax;

public class RightTriangle extends Figure {
   private int hypotenuse;
   private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
        draw();
    }

    @Override
    public void draw() {
        area = side * this.hypotenuse / 2;
    }

    @Override
    public String toString() {
        return "Figure: triangle, area: " + area + " sq. units, hypotenuse: " +
                hypotenuse + ", sides: " + side + ", color: " + color;
    }
}
