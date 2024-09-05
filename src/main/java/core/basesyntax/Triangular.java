package core.basesyntax;

public interface Triangular {
    default double calculateTriangleArea(double firstLeg, double secondLeg) {
        return firstLeg * secondLeg * 0.5;
    }
}
