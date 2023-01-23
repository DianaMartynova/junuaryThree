public class Ball extends SolidOfRevolution {
 public Ball(double radius, double obyom){
     super(radius, obyom);

 }

    public double vBall() {
        double resultBall = ((3 / 4) * Math.PI * getRadius(4.5));
        return Math.pow(resultBall, 3);
    }

}
