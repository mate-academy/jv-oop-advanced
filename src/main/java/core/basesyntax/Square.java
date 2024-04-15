package core.basesyntax;

public class Square extends Figure {
    private int side;
    private Colors color;

    public Square() {
        this.side = random.nextInt(1, 11);
        this.color = colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq. units, " + "side: " + side + " units, color: " + color);
    }
}
