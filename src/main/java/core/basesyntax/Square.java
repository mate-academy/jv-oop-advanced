package core.basesyntax;

public class Square extends Figure {
    private int leg;

    Square(String color, int leg) {
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
    double area() {
        return getLeg() * getLeg();
    }

    @Override
    String nameOfFigure() {
        return "square";
    }

    @Override
    void infoAboutFigure() {
        System.out.println(new StringBuilder().append("Figure: square, area: ").append(area())
                .append(" sq.units, side: ").append(getLeg()).append(" units, color: ")
                .append(getColor()));
    }
}
