public class WeatherList{
      // class  object/instance
      int NUMDATA = 60;

      Weather weather[] = new Weather[NUMDATA]; //line 17-21: generate data
      
      
      public void Data(){
          double Range[] =  {20, 45, 100};
          for (int i=0; i<weather.length; i++) {
              weather[i] = new Weather();  
              weather[i].generate(Range);
              weather[i].display();
              }
          
      }
	  
	  public double minWeather(int choice) {
        double min=0;
        for (int i=0;i<weather.length;i++){
            switch (choice){
                case 1:{
                    min = weather[0].getTemperature();
                    if (min > weather[i].getTemperature()) min = weather[i].getTemperature();
                    break;
                    }
                    
                case 2:{
                    min = weather[0].getWind();
                    if (min > weather[i].getWind()) min = weather[i].getWind();
                    break;
                    
                }
                    
                case 3:{
                    min = weather[0].getHumidity();
                    if (min > weather[i].getHumidity()) min = weather[i].getHumidity();
                    break;
                    }
                
                    
                case 4:{
                    min = weather[0].getPrecipitation();
                    if (min > weather[i].getPrecipitation()) min = weather[i].getPrecipitation();
                    break;
                    
                }
                    
            }
        
        }
    return min;
    }
    
    public double maxWeather(int choice) {
        double max=0;
        for(int i=0;i<NUMDATA;i++){
            switch (choice){
                case 1:{
                    max = weather[0].getTemperature();
                    if (max < weather[i].getTemperature()) max = weather[i].getTemperature();
                    break;
                }
                    
                    
                case 2:{
                    max = weather[0].getWind();
                    if (max < weather[i].getWind()) max = weather[i].getWind();
                    break;
                    }
                
                    
                case 3:{
                    max = weather[0].getHumidity();
                    if (max < weather[i].getHumidity()) max = weather[i].getHumidity();
                    break;
                    
                }
                    
                case 4:{
                    max = weather[0].getPrecipitation();
                    if (max < weather[i].getPrecipitation()) max = weather[i].getPrecipitation();
                    break;
                    
                }
                    
            }
        
        }
        return max;
    }
    
    
    public double avgWeather(int choice) {
        double sum = 0;
        for(int i=0;i<NUMDATA;i++){
            switch (choice){
                case 1:{
                    sum += weather[i].getTemperature();
                    break;
                }
                    
                case 2:{
                    sum += weather[i].getWind();
                    break;
                }
                    
                case 3:{
                    sum += weather[i].getHumidity();
                    break;
                }
                    
                case 4:{
                    sum += weather[i].getPrecipitation();
                    break;
                }
                    
            }
        }
        double avg = sum / NUMDATA;    
        return avg;
        }
        
    public double stdDevWeather(double avg,int choice) {
        double sum=0, stdDev=0;
        for(int i=0;i<NUMDATA;i++){
            switch (choice){
                case 1:{
                    sum += Math.pow(weather[i].getTemperature() - avg,2);
                    stdDev = sum/NUMDATA;
                    break;
                }
                case 2:{
                    sum += Math.pow(weather[i].getWind() - avg,2);
                    stdDev = sum/NUMDATA;
                    break;
                }
                case 3:{
                    sum += Math.pow(weather[i].getHumidity() - avg,2);
                    stdDev = sum/NUMDATA;
                    break;
                }
                case 4:{
                    sum += Math.pow(weather[i].getPrecipitation() - avg,2);
                    stdDev = sum/NUMDATA;
                    break;
                }
                
            }
        }
    return stdDev;
    }
}