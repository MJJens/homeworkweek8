public class WeatherStationList {

    public int NUMSTATIONS = 4;
    WeatherStation stations[] = new WeatherStation[NUMSTATIONS];
    
    // operations
    public double calcMaxNumSensors(){
        int maxNumSensors = stations[0].getNumSensors();
        for(int i=0;i<NUMSTATIONS;i++){
            if(stations[i].getNumSensors() > maxNumSensors){
                maxNumSensors = stations[i].getNumSensors();
            }
        }
        return maxNumSensors;
    }
    
    public double calcMinNumSensors() {
        int minNumSensors = stations[0].getNumSensors();
        for(int i=0;i<NUMSTATIONS;i++){
            if(stations[i].getNumSensors() < minNumSensors){
                minNumSensors = stations[i].getNumSensors();
            }
        }
        return minNumSensors;
    }
    
    public double calcAvgNumSensors() {
        float sumNumSensor = 0;
        for(int i=0;i<NUMSTATIONS;i++){
            sumNumSensor += stations[i].getNumSensors();
        }
        float avg = sumNumSensor/NUMSTATIONS;
        return avg;
    }
    
    public void input() {
        
        for (int i=0; i< NUMSTATIONS; i++) {
            stations[i] = new WeatherStation();
            stations[i].readWeatherStationData();
            stations[i].calcStats();
        }
        System.out.println("the min number of sensors: " + calcMinNumSensors());
        System.out.println("the max number of sensors: " + calcMaxNumSensors());
        System.out.println("the avg number of sensors: " + calcAvgNumSensors());
    }

    
};