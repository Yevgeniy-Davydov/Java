public class Magic {
  public static void main(String[] args) {
    // this is a refer number
    int myNumber = 1;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
    // prints always 3, no matter how big refer number is
  }
}
