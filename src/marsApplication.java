public class marsApplication {
    public static void main (String args[]){
        Robot.WalkingRobot.TwoLeggedWalkingRobot.ScienceRobot.MarsRobot spirit = new Robot.WalkingRobot.TwoLeggedWalkingRobot.ScienceRobot.MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
