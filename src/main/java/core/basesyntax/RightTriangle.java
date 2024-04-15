package core.basesyntax;

public class RightTriangle extends Figure {
    private int kat;
    private int kat1;
    private Colors color;

    public RightTriangle() {
        this.kat = random.nextInt(1, 11);
        this.kat1 = random.nextInt(1, 11);
        this.color = colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return this.kat * kat1 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq. units, " + " side a: " + kat
                + " side b: " + kat1 + " units, color: " + color);
    }
}
