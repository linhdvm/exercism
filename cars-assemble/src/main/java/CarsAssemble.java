public class CarsAssemble {
    // setting productivity per hour
    private static final int CARS_PER_HOUR = 221;

    // method to determine success rate
    private double successRate(int speed) {
        // check whether the speed is Valid
        double successRate = 0.00;
        boolean isValidSpeed = (speed >= 0 && speed <= 10);
        if (isValidSpeed) {
            switch (speed) {
                case 1:
                case 2:
                case 3:
                case 4:
                    successRate = 1.0;
                    break;
                case 5: case 6: case 7:case 8:
                    successRate = 0.90;
                    break;
                case 9:
                    successRate = 0.8;
                    break;
                case 10:
                    successRate = 0.77;
                    break;
                default:
                    successRate = 0;
                    break;
            }
        }
        return successRate;
    }

    // at the lowest speed (1), 221 cars are produced each hour.
    // speed can range from 0 to 10

    // higher speeds increase the likelihood that faulty cars are produced.
    public double productionRatePerHour(int speed) {
        return  CARS_PER_HOUR * speed * successRate(speed) ;
    }

    // method to determine how many cars are produced per minute
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
