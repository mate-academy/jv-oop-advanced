package core.basesyntax.shapes;

public class RightTriangle extends Shape {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String name, String color, double width, double height) {
        super(name, color);
        this.firstLeg = width;
        this.secondLeg = height;
        this.hypotenuse = Math.sqrt(Math.pow(this.firstLeg, 2) + Math.pow(this.secondLeg, 2));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: " + this.getName() + ", "
                        + "area: %.1f" + " sq. units, "
                        + "hypotenuse: %.1f" + " units, "
                        + "color: " + this.getColor() + "\n",
                getArea(), getHypotenuse());
    }
}
