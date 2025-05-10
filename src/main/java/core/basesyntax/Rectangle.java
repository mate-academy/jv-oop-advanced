package core.basesyntax;

class Rectangle extends AbstractFigure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: " + height + " units, color: " + getColor());
    }
}
