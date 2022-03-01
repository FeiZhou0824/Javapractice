package day31;

public class SalaryCalculate {
    
    public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public SalaryCalculate(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    
    public double salary(){
        return (hourlyRate * weeklyHours *52);
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculate{" +
                "salary = $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax = $" + federalTax() +
                ", salary after tax = $" + salaryAfterTax() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:        
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax 
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */