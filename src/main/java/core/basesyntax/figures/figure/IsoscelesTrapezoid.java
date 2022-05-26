package core.basesyntax.figures.figure;

import core.basesyntax.figures.IsoscelesTrapezoidies;

public class IsoscelesTrapezoid extends IsoscelesTrapezoidies {
    public IsoscelesTrapezoid(String color, int downLength, int upLength, int heightLength) {
        super(color, downLength, upLength, heightLength);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public int getDownLength() {
        return super.getDownLength();
    }

    @Override
    public void setDownLength(int downLength) {
        super.setDownLength(downLength);
    }

    @Override
    public int getUpLength() {
        return super.getUpLength();
    }

    @Override
    public void setUpLength(int upLength) {
        super.setUpLength(upLength);
    }

    @Override
    public int getHeightLength() {
        return super.getHeightLength();
    }

    @Override
    public void setHeightLength(int heightLength) {
        super.setHeightLength(heightLength);
    }
}
