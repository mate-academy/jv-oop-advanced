package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements HasHeight, HasDiagonal {
    private double downSide;
    private double upSide;
    private double side;

    public IsoscelesTrapezoid(String color, double downSide, double upSide, double side) {
        super(color);
        this.downSide = downSide;
        this.upSide = upSide;
        this.side = side;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    public double getUpSide() {
        return upSide;
    }

    public void setUpSide(double upSide) {
        this.upSide = upSide;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static IsoscelesTrapezoid generateFigure() {
        return new IsoscelesTrapezoid(Colors.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3,
                (int)(Math.random() * 27) + 3, (int)(Math.random() * 10) + 3);
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * Math.sqrt(side * side
                - Math.pow(upSide - downSide, 2) / 4);
    }

    @Override
    public void infoAboutFigure() {
        System.out.printf("Shape: isosceles trapezoid, area: %.3f sq. units,"
                        + " up side length: %s units, down side length: %s units,"
                        + " sides length: %s units,"
                        + " height: %.3f units, diagonal: %.3f units, color: %s", getArea(),
                upSide, downSide, side, getHeight(), getDiagonal(), getColor());
        System.out.println();
    }

    @Override
    public double getHeight() {
        return Math.sqrt(side * side - Math.pow(upSide - downSide, 2) / 4);
    }

    @Override
    public void drawFigure() {
        System.out.println(" You draw " + getColor() + " isosceles trapezoid!");
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(side * side + upSide * downSide);
    }
}
