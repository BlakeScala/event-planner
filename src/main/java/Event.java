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
  private Integer mTotalCost = 0;
  // public Integer mfoodCost;

  public Event(Integer numberOfPeople, String foodChoice, String beverageChoice, String entertainmentChoice) {
    mNumberOfPeople = numberOfPeople;
    mFoodChoice = foodChoice;
    mBeverageChoice = beverageChoice;
    mEntertainmentChoice = entertainmentChoice;
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
    mNumberOfPeople = mNumberOfPeople * 4;
    return mNumberOfPeople;
  }
  public Integer foodCost() {
    for(int i = 0; i<mChoiceArray.length; i++) {
      if (mFoodChoice.equals(mChoiceArray[i])){
        mTotalCost += mFoodCostArray[i];
      }
    } return mTotalCost;
  }
  public Integer beverageCost() {
    for (int i = 0; i<mChoiceArray.length; i++){
      if (mBeverageChoice.equals(mChoiceArray[i])){
        mTotalCost += mBeverageCostArray[i];
      }
    }
    return mTotalCost;
  }
}
