package Homework;

public class Main {
	public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        RobotDancer robotDancer = new RobotDancer();

        robot.work();
        coffeRobot.work();
        robotCoocker.work();
        robotDancer.work();

        System.out.println("");

        Robot [] robots = {robot, robotCoocker, robotDancer, coffeRobot};

        for (int a = 0; a < robots.length; a++) {
            robots[a].work();
        }
    }
}
