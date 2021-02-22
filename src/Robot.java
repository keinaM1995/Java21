public class Robot {
    public static class DrivingRobot {
    }

    public static class WalkingRobot {
        public static class TwoLeggedWalkingRobot {
            public static class SearchRobot {
            }

            public static class ScienceRobot {

                public static class MarsRobot {
                    String status;
                    int speed;
                    float temperature;

                    void checkTemperature(){
                        if (temperature < -62) {
                            status = "powrót do domu";
                            speed = 5;
                        }

                    }

                    void showAttributes(){
                        System.out.println("Status: " + status);
                        System.out.println("Prędkość: " + speed);
                        System.out.println("Temperatura: " + temperature);
                    }
                }
            }

            public static class GuardRobot {
            }
        }

        public static class FourLeggedWalkingRobot {
        }
    }
}
