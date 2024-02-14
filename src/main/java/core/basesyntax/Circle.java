package core.basesyntax;

class Circle extends Figure {
    private int radius;

    public Circle(int a, String str) {
        this.radius = a;
        setColor(str);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return (double) radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
