package core.basesyntax;

public class Square extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name = "square";
    private String color = colorSupplier.getRandomColor();
    private int side = (int)(Math.random() * 100);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public void drow() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "side: " + side + " units, " + "color: " + color);
    }
}
