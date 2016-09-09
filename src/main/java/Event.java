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
  // public String[][] foodsArray = {cheapFoodArray, mediumFoodArray, expensiveFoodArray};
  public String[] cheapFoodArray = {"chips", "pretzels", "salsa"};

  public Integer getNumberOfPeople() {
    return mNumberOfPeople;
  }

  public String getFoodServed() {
    return mFoodServed;
  }

  public String getBeveragesServed() {
    return mBeveragesServed;
  }

  public boolean getHireBand() {
    return mHireBand;
  }

  public Integer numberOfPeopleCost() {
    Integer peopleCost = getNumberOfPeople() * 2;
    return peopleCost;
  }

  // public Integer foodServedCost() {
  //   Integer foodCost;
  //   for (int i = 0: cheapFoodArray.length) {
  //     if (cheapFoodArray[i].contains(getFoodServed())){
  //       foodCost += 3;
  //     }
  //   }
  // }
}
