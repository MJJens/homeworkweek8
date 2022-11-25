import java.util.Scanner;  // Import the Scanner class

public class WeatherStation {
    private String location;
    private String reportingbody;
    private int numsensors;
    WeatherList weatherData = new WeatherList();
    Scanner input = new Scanner(System.in);
    
    // operations
    public String getLocation(){
	    return location;
	}
	
	public void setLocation(String loc){
	    location = loc;
	}
	
	public String getReportingBody(){
	    return reportingbody;
	}
	
	public void setReportingBody(String report){
	    reportingbody = report;
	}
	public int getNumSensors(){
	    return numsensors;
	}
	
	public void setNumSensors(int numsens){
	    numsensors = numsens;
	}
    public void readWeatherStationData() {
        // read in data for each weather station
        System.out.println("enter location:");
        setLocation(input.nextLine());
        System.out.println("enter the reporting body:");
        setReportingBody(input.nextLine());
        System.out.println("enter number of sensor:");
        setNumSensors(input.nextInt());
        weatherData.Data();
    }
    
    public void calcStats() {
        int option;
        System.out.println("Options");
        System.out.println("1. Calc min weather");
        System.out.println("2. Calc max weather");
        System.out.println("3. Calc average weather");
        System.out.println("4. Calc standard deviation weather");
        System.out.println("Enter options: ");
        option = input.nextInt();
        
        int choiceWeather;
        System.out.println("Options");
        System.out.println("1. temperature");
        System.out.println("2. wind");
        System.out.println("3. humidity");
        System.out.println("4. precipitation");
        System.out.println("Enter options: ");
        choiceWeather =  input.nextInt();
        double avg = weatherData.avgWeather(choiceWeather);
        switch(option){
            case 1:{
                    double min = weatherData.minWeather(choiceWeather);   
                    System.out.println(min);
                    break;
            }
            
            case 2: {
                    double max = weatherData.maxWeather(choiceWeather);
                    System.out.println(max);
                    break;
            }
                    
            case 3:{
                    System.out.println(avg);
                    break;
            } 
                    
            case 4:{
                    double stdDev = weatherData.stdDevWeather(avg,choiceWeather);
                    System.out.println(stdDev);
                    break;
            }
            
        }
        
    }

};
