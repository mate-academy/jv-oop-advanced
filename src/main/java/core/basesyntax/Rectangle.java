package core.basesyntax;

public class Rectangle extends Figure {
    private int sidea;
    private int sideb;
    private Colors color;

    public Rectangle() {
        this.sidea = random.nextInt(1, 11);
        this.sideb = random.nextInt(1, 11);
        this.color = colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return this.sidea * this.sideb;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, " + "side a: " + sidea
                + " side b: " + sideb + " units, color: " + color);
    }
}
