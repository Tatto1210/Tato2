public class SEXO {
    private int time;
    private double amount;
    private double interest;
   

    public SEXO(){
        this.time = 0;
        this.amount = 0;
        this.interest = 0;
    }
    
    public SEXO(int time, double amount, double interest) {
        this.time = time;
        this.amount = amount;
        this.interest = interest;
    }

    public int getTime() {
        return time;
    }
    public double getAmount() {
        return amount;
    }
    public double getInterest() {
        return interest;
    }


   
}
