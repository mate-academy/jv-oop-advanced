package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private Colors color;
    private double area;

    public Rectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.sideA = Math.random();
        this.sideB = Math.random();
        this.color = colorSupplier.getRandomColor();
        this.area = sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle :");
        System.out.println(" sideA: " + sideA
                + " sideB: " + sideB
                + " color: " + color
                + " area: " + area);
    }
}
