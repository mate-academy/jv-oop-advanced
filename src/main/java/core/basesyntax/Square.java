package core.basesyntax;

public class Square extends Figure {
    private float sideLength;
    private double area;

    public Square(Color color, float sideLength) {
        super(color);
        this.sideLength = sideLength;
        area =  sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + area +
                " sq.units, side: " + sideLength + " units, color: " + getColor());
    }
}
