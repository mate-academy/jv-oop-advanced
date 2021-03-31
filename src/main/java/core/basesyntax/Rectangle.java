package core.basesyntax;

public class Rectangle extends Figures {
    private final int littleSide;
    private final int bigSide;

    public Rectangle(String color, int littleSide, int bigSide) {
        super(color);
        this.littleSide = littleSide;
        this.bigSide = bigSide;
    }

    @Override
    public double getArea() {
        return littleSide * bigSide;
    }

    @Override
    public void getDraw() {
        String name = "rectangle";
        System.out.println("Figure: " + name + "," + " area:"
                + getArea() + " sq. units, littleSide length: "
                + littleSide + " units, bigSide length:  "
                + bigSide + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "littleSide=" + littleSide
                + ", bigSide=" + bigSide
                + ", color='" + getColor() + '\''
                + '}';
    }
}


