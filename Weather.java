import java.util.Random;

public class Weather { // a class consists of data + operation
    
    // data
    private double temperature;
    private double wind;
    private double humidity;
    private double precipitation;
    
    // operation : must be tightly coupled to the data
    public void generate(double Range[]) {
		Random rand = new Random();
        temperature = rand.nextDouble()* (Range[1]-Range[0])+ Range[0];
		precipitation = rand.nextDouble() * Range[2];
		wind = rand.nextDouble() * Range[0];
		humidity= rand.nextDouble() * Range[2];
		
    }
	
	public void display(){
		System.out.println("temperature: " + temperature);
		System.out.println("humidity: " + humidity);
		System.out.println("precipitation: " + precipitation);
		System.out.println("wind: " + wind);
	}
	
	//setter * getter for private attributes
	public double getTemperature(){
	    return temperature;
	}
	
	public void setTemperature(double temp){
	    temperature = temp;
	}
	
	public double getWind(){
	    return wind;
	}
	
	public void setWind(double Wind){
	    wind = Wind;
	}
	
	public double getHumidity(){
	    return humidity;
	}
	
	public void setHumidity(double hum){
	    humidity = hum;
	}
	
	public double getPrecipitation(){
	    return precipitation;
	}
	
	public void setPrecipitation(double preci){
	    precipitation = preci;
	}
	

	
} 
//An array in Java is an object, hence it has different attributes
//Upon creating an array, it will contain nothing, hence the 'null' when displaying it