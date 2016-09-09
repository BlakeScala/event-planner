import java.util.Arrays;

public class Event {
  private Integer mNumberOfPeople;
  private String mFoodChoice;
  private String mBeverageChoice;
  private String mEntertainmentChoice;
  private String[] mChoiceArray = {"1", "2", "3", "4", "5"};
  private Integer[] mFoodCostArray = {0, 50, 80, 120, 200};
  private Integer[] mBeverageCostArray = {0, 30, 50, 100, 200};
  private Integer[] mEntertainmentCostArray = {0, 50, 100, 150, 250};
  // public Integer mfoodCost;

  public Event(Integer numberOfPeople, String foodChoice, String beverageChoice, String entertainmentChoice) {
    mNumberOfPeople = numberOfPeople;
    mFoodChoice = foodChoice;
    mBeverageChoice = beverageChoice;
    mEntertainmentChoice = entertainmentChoice;
    // mfoodCost = 0;
  }

  public Integer getNumberOfPeople() {
    return mNumberOfPeople;
  }

  public String getfoodChoice() {
    return mFoodChoice;
  }

  public String getBeverageChoice() {
    return mBeverageChoice;
  }

  public String getEntertainmentChoice() {
    return mEntertainmentChoice;
  }

  public Integer numberOfPeopleCost() {
    Integer peopleCost = getNumberOfPeople() * 2;
    return peopleCost;
  }

  // public Integer foodChoiceCost() {
  //   for (int i = 0; i < cheapFoodArray.length; i ++) {
  //     if (cheapFoodArray[i].contains(String.valueOf(getfoodChoice()))){
  //       mfoodCost += 3;
  //     }
  //   }
  //   return mfoodCost;
  // }
}
