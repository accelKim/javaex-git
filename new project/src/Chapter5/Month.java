package Chapter5;

public enum Month {
  JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6),
  JOUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);

  private int Month;

  private Month(int Month){
    this.Month = Month;
  }

  public int getMonth() {
    return Month;
  }
}
