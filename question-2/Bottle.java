public class Bottle {
  private double capacity;
  private double amount;

  public Bottle(double c) {
    capacity = c;
    amount = c;
  }

  public double updateAmount(double removed) {

    amount -= removed;

    if (amount < capacity/4) {
      amount = capacity;
    }

    return amount;
  }
}
