public class SolidOfRevolution extends Shape{
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    private double radius;
    public double getRadius(double radius){
     this.radius = radius;
     return radius;
    }
    public SolidOfRevolution(double radius,double obyom){
        super(obyom);

       this.radius = radius;
    }
}
