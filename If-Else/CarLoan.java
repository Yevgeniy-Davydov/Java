public class CarLoan {
// calculation of monthly payment for the car
  public static void main(String[] args) {

    int carLoan = 10000;
    // 3years
    int loanLength = 3; 
    // 5 % on the loan
    int interestRate = 5; 
    // down payment provided by a user
    int downPayment = 2000;
    // requirements
    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan");
    }else if (downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      // calculation 
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
      
    }
  }
}
