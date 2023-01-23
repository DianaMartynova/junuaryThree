public class Cylinder extends SolidOfRevolution {
    public Cylinder(double radius, double obyom) {
        super(radius, obyom);

    }

    private double hCylinder;

    public double getH(double hCylinder) {
        this.hCylinder = hCylinder;
        return hCylinder;
    }


    public double vСylinder(double radiusCylinder, double hCylinder) {
        return Math.PI * (radiusCylinder * radiusCylinder) * hCylinder;
    }

}
