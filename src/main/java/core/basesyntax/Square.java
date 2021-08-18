package core.basesyntax;

public class Square extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name;
    private String color;
    private int side;

    public Square() {
        this.name = "square";
        this.color = colorSupplier.getRandomColor();
        this.side = (int)(Math.random() * 100);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String drow() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "side: " + side + " units, " + "color: " + color;
    }
}
