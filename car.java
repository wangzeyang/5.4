
public class car {
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	private static int count=0;
	/**
	 initialize values of car's instance variables or aattributtes
	 */
	
	public car(){
		this("white",250,4.0,"Toyota");
		
	}
	public car(String color,int horsePower, double engineSize, String make){
		 this.color=color;
		 this.horsePower=horsePower;
		 this.engineSize=engineSize;
		 this.make=make;
		 count++;
		 }
	
	public void setColor(String color){
		this.color=color;
	}
	public void setHorsePower(int horsePower){
		this.horsePower=horsePower;
	}
	public void setEngineSize(double engineSize){
		this.engineSize=engineSize;
	}
	public void setMake(String make){
		this.make=make;
	}
	public String getColor(){
		return color;
	}
	public int getHorsePower(){
		return horsePower;
	}
	public double getEngineSize(){
		return engineSize;
	}
	public String getMake(){
		return make;
		
	}
	public static int getCount() {
		
		return count;
	}
	public boolean equals(car car){
		return this.color.equals(car.color) && horsePower == car.horsePower &&  engineSize == car.engineSize && make == car.make;
		
		
	}

	public String toString(){
		return this.color+" "+ this.horsePower+" "+this.engineSize+" "+this.make;
	}
	
}