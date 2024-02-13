package core.basesyntax;

class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return (double) radius * radius * Math.PI;
    }

    @Override
    public void info() {
        System.out.println("Figure: circle, area: " + area() + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }

}
