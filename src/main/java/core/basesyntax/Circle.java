package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public int areaCalculate() {
        return (int) (Math.PI * Math.pow((this.radius), 2));
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %d sq. units, radius: %d units, color: %s \n",
                getName(), areaCalculate(), radius, getColor());
    }
}
