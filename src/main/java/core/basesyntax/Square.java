package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double gerArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Square " + "\n" + "side " + "= " + side + " units" + "\n" + "area " + "= "
                + gerArea() + " sq.units" + "\n" + "colors " + "= " + getColor());
    }
}

