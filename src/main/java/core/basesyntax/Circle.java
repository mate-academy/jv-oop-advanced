package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Colors color,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        String outtext = "Figure: Circle , area: "
                + this.getArea()
                + " sq.units, radius: " + this.radius
                + ", color: " + super.getBasecolor();
        System.out.println(outtext);
    }
}
