class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private final static int DISTANCE_INCREMENT = 10;
    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    public void drive() {
        distanceTravelled += DISTANCE_INCREMENT;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return this.numberOfVictories - car.numberOfVictories;
    }

}
