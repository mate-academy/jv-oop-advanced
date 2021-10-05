package com.company;

public class IsoscelesTrapezoid implements Figure {
    public double baseIsTrapezoid;
    public double upbaseIsTrapezoid;
    public double heihgtIsTrapezoid;

    public IsoscelesTrapezoid(int baseIsTrapezoid, int upbaseIsTrapezoid, int heihgtIsTrapezoid) {
        this.baseIsTrapezoid = baseIsTrapezoid;
        this.upbaseIsTrapezoid = upbaseIsTrapezoid;
        this.heihgtIsTrapezoid = heihgtIsTrapezoid;
    }

    @Override
    public double getArea() {
        return (baseIsTrapezoid + upbaseIsTrapezoid) / 2 * heihgtIsTrapezoid;
    }
}
