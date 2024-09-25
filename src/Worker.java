public class Worker {
	private String name;
	private double payPerHour;
	private double hours;
	private double extraHours;
	
	//card for the new guy
	public Worker(String workerName, double hourPay)
	{
		this.name=workerName;
		this.payPerHour=hourPay;
		this.hours=0;
		this.extraHours=0;
	}

    //set hours working
	public void setHours(double h)
	{
		this.hours=h;
	}
	//set extra hours working
	public void setExtraHours(double h)
	{
	this.extraHours=h;
	}
	//get more pay per hour
	public void addPay(double raise)
	{
		this.payPerHour=this.payPerHour+raise;
	}
	//get name
	public String getName()
	{
		return this.name;
	}
	//get ordinary hours
	public double getHours()
	{
		return this.hours;
	}
	//get extra hours
	double getExtraHours()
	{
		return this.extraHours;
	}
	//get pay per hour
	public double getPayPerHour()
	{
		return this.payPerHour;
	}
	// the guy's salary
	public double calcSalary()
	{ 
		double salary=1.25*this.extraHours*this.payPerHour+this.payPerHour*this.hours;
		return salary;
	}
	//string name and pay per hour
    @Override
	public String toString()
	{
		return ("name: "+this.name+",  pay per hour: "+this.payPerHour);
	}

    public void setName(String name) {
        this.name = name;
    }
}

