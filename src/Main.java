public class Main {
    public static void main(String[] args) {
      Ball ball = new Ball(3,45);
      ball.vBall();
    System.out.println(ball.vBall());
    Cylinder cylinder = new Cylinder(3,5.4);
    cylinder.vСylinder(3,5.4);
    System.out.println();

    Box boxOne = new Box(40);
    Box boxTwo = new Box(4);
    System.out.println(boxOne.equals(boxTwo));


    }

}