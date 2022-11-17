package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstSide;
    private int secondSide;

    public IsoscelesTrapezoid(int height, int firstSide, int secondSide, String color) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public int getArea() {
        return (firstSide + secondSide) * height / 2;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder("Figure: isosceles trapezoid, area: ");
        info.append(getArea());
        info.append(" sq.units, height: ");
        info.append(height);
        info.append(" units, first horizontal side: ");
        info.append(firstSide);
        info.append(" units, second horizontal side: ");
        info.append(secondSide);
        info.append(" units, color: ");
        info.append(getColor().toLowerCase());
        System.out.println(info);
    }
}
