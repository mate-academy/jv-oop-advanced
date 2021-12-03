package core.basesyntax;

public class IsoscelesTapezoid extends Figure {
    private double base1;
    private double base2;
    private double leg;
    private double height;
    private Colors color;
    private double area;

    public IsoscelesTapezoid() {
        final ColorSupplier colorSupplier = new ColorSupplier();
        this.base1 = Math.random();
        this.base2 = Math.random();
        this.leg = Math.random();
        this.height = Math.random();
        this.color = colorSupplier.getRandomColor();
        this.area = 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Tapezoid");
        System.out.println(" base1: " + base1
                + " base2: " + base2
                + " leg: " + leg
                + " color:" + color
                + " area: " + area);
    }
}
