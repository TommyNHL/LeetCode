public class Q1603_DesignParkingSystem {
  private int big;
  private int medium;
  private int small;
  private int carType;

  public Q1603_DesignParkingSystem(int big, int medium, int small) {
    this.big = big;
    this.medium = medium;
    this.small = small;
  }
  
  public boolean addCar(int carType) {
    if (carType == 1 && this.big > 0) {
      this.big -= 1;
      return true;
    } else if (carType == 2 && this.medium > 0) {
      this.medium--;
      return true;
    } else if (carType == 3 && this.small > 0) {
      this.small--;
      return true;
    } else {
      return false;
    }
  }
  // ===========================================================================
}