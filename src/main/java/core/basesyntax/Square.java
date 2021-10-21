package core.basesyntax;

public class Square extends Figure {
    private int leg;

    public Square(String color, int leg) {
        super(color);
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public double area() {
        return getLeg() * getLeg();
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: square, area: ").append(area())
                .append(" sq.units, side: ").append(getLeg()).append(" units, color: ")
                .append(getColor().toLowerCase()));
    }
}
