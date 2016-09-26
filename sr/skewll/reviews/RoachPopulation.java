package skewll.reviews;


public class RoachPopulation {
  private int roachPop;
  public RoachPopulation(int initPop){
    roachPop = initPop;
  }
  public void setPop(int pop){
    roachPop = pop;
  }
  public void breed() {
    roachPop *=2;
  }
  public void spray(double percent){
    roachPop *= (1 - (percent / 100));
  }
  public int getRoaches(){
    return roachPop;
  }
}
