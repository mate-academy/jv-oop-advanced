package core.basesyntax.shapes;

public class RightTriangle extends Shape implements Drawable{
    private double width;
    private double height;
    private double hypotenuse;

    public RightTriangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
        this.hypotenuse = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public void draw() {
        //Figure: triangle, area: 12.5 sq. units, hypotenuse: 7.1 units, color: yellow
        System.out.println("Figure: " + this.getName() + ", "
                + "area: " + getArea() + " sq. units, "
                + " hypotenuse: " + getHypotenuse() + " units, "
                + "color: " + this.getColor());
    }
}
