package core.basesyntax;

class Circle extends ColorsOfFigures {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void getToDraw() {
        System.out.println("radius: " + radius);
    }
}
