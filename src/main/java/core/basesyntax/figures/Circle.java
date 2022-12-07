package core.basesyntax.figures;


public class Circle extends Figure {
     int radius = 10;
    @Override
    public int area() {
        return radius;
    }
    @Override
    public void print() {
        System.out.println("Figure: circle, area: " + this.area() + " radius: "
                + this.radius + " units, color: " + this.color);
    }
}
