package core.basesyntax.model;

public class Square extends Figure {
    private int basis;

    public Square(int basis, String color) {
        super(color);
        this.basis = basis;

    }

    @Override
    public double getArea() {
        return basis * basis;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square , area: " + getArea() + " m2, "
                + "side: " + basis + " m," + " color: " + getColor());
    }

}
