package core.basesyntax;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: "
                + getArea() + " sq.units, side: " + getSide()
                + " units, color: " + getColor();
    }
}
