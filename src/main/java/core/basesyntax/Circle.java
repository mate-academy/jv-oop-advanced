package core.basesyntax;

class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "the radius is: "
                + radius
                + " and the color is: "
                + color);
    }
}
