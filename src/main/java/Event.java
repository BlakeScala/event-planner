public class Event {
  private Integer mNumberOfPeople;
  private String mFoodServed;
  private String mBeveragesServed;
  private boolean mHireBand;


  public Event(Integer numberOfPeople, String foodServed, String beveragesServed, boolean hireBand) {
    mNumberOfPeople = numberOfPeople;
    mFoodServed = foodServed;
    mBeveragesServed = beveragesServed;
    mHireBand = hireBand;
  }

  public Integer getNumberOfPeople(){
    return mNumberOfPeople;
  }
}
