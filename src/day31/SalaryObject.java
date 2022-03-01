package day31;

public class SalaryObject {

    public static void main(String[] args) {

        SalaryCalculate salary1 = new SalaryCalculate(65,0.06,0.03,40);

        salary1.salary();
        salary1.stateTax();
        salary1.federalTax();
        salary1.salaryAfterTax();

        System.out.println(salary1);
    }
}
