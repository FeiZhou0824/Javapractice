package ifStatementPractice_FromMuhtarNotes;

public class SalaryAfterTax {  //答案在DAY 11 GITHUB 我需要重看这个答案

    public static void main(String[] args) {
        int salary = 150000;
        double salaryAfterTax;
        boolean married = true;

        if (salary >= 130000) {
            salaryAfterTax = (salary - (salary * (35 / 100)));
        }
        else if(salary>=130000 && married  ) {
            salaryAfterTax = (salary - (salary * (35 - 5) / 100));
        } else if (salary>=100000 && !married) {
            salaryAfterTax = (salary - (salary * (30 / 100)));
        }else if (salary>=100000 && married) {
            salaryAfterTax = (salary - (salary * (30 - 5) / 100));
        }else if (salary>=80000 && !married){
            salaryAfterTax= (salary - (salary * (25/100)));
        }else if(salary>=80000 && married){
            salaryAfterTax = (salary - (salary * (25-5)/100));
        }else if(salary<=79000 && !married)
        {salaryAfterTax= (salary - (salary * (20 / 100)));
        }else {
            salaryAfterTax = (salary - (salary * (20 - 5 )/ 100));
        }
        System.out.println(salaryAfterTax);




       /* if(salary>=130000 && married  ) {
            salaryAfterTax = (salary - (salary * (35 - 5) / 100));
        }else if(salary>=130000 && married == false ){
                salaryAfterTax= (salary - (salary *(35/100)));
        } else if(salary>=100000 && married){
            salaryAfterTax = (salary - (salary * (30-5)/100));
        }else if(salary>=100000 && !married) {
            salaryAfterTax = (salary - (salary * (30 / 100)));
        }else if(salary>=80000 && married){
            salaryAfterTax = (salary - (salary * (25-5)/100));
        }else if(salary>=80000 && !married){
            salaryAfterTax= (salary - (salary * (25/100)));
        } else if(salary<=79000 && married)
        {salaryAfterTax= (salary - (salary * (20 - 5 )/ 100));

        }else {
            salaryAfterTax= (salary - (salary * (20 / 100)));
        }
        System.out.println(salaryAfterTax);



        */




      /*  int salary = 70_000;
        double SalaryAfterTax ;
        boolean IfMarried = true;


        if(!IfMarried && salary>=130_000){
            SalaryAfterTax=salary-(salary*0.35);
        }else if(IfMarried && salary>=130_000){
            SalaryAfterTax=salary-(salary*0.35) +(salary*0.05);
        }else if(!IfMarried && salary>=100_000){
            SalaryAfterTax=salary-(salary*0.30);
        }else if(IfMarried && salary>=100_000){
            SalaryAfterTax=salary-(salary*0.30) +(salary*0.05);
        }else if(!IfMarried && salary>=80_000){
            SalaryAfterTax=salary-(salary*0.25);
        }else if(IfMarried && salary>=80_000){
            SalaryAfterTax=salary-(salary*0.25)+(salary*0.05);
        }else if(!IfMarried && salary<80_000){
            SalaryAfterTax=salary-(salary*0.20);
        }else{
            SalaryAfterTax=salary-(salary*0.20)+(salary*0.05);
        }

        System.out.println(SalaryAfterTax);

       */

        }
    }
