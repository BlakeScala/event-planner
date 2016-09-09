import java.util.Arrays;

public class Event {
  private Integer mNumberOfPeople;
  private String mFoodChoice;
  private String mBeverageChoice;
  private String mEntertainmentChoice;
  private String[] mChoiceArray = {"1", "2", "3", "4", "5"};
  private Integer[] mFoodCostArray = {0, 50, 80, 120, 200};
  private String[] mFoodChoicesArray = {"No catering", "Basic sampler trays", "Basic buffet", "Deluxe buffet", "Full menu"};
  private Integer[] mBeverageCostArray = {0, 30, 50, 100, 200};
  private String[] mBeverageChoicesArray = {"BYOB", "Punch bowl", "Drink fountain", "Drink fountain and punch bowls", "Open bar"};
  private Integer[] mEntertainmentCostArray = {0, 50, 100, 150, 250};
  private String[] mEntertainmentChoicesArray = {"None", "Equipment", "House DJ", "Acoustic guitarist", "Band"};
  private Integer mTotalCost = 0;
  private String mOutputFood;
  private String mOutputBeverage;
  private String mOutputEntertainment;

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

  public Integer getTotalCost() {
    return mTotalCost;
  }

  public String getOutputFood() {
    return mOutputFood;
  }

  public String getOutputBeverage() {
    return mOutputBeverage;
  }

  public String getOutputEntertainment() {
    return mOutputEntertainment;
  }

  public Integer calculateTotalCost(){
    for(int i = 0; i<mChoiceArray.length; i++) {
      if (mFoodChoice.equals(mChoiceArray[i])){
        mTotalCost += mFoodCostArray[i];
        mOutputFood = mFoodChoicesArray[i];
      }
    }
    for (int i = 0; i<mChoiceArray.length; i++){
      if (mBeverageChoice.equals(mChoiceArray[i])){
        mTotalCost += mBeverageCostArray[i];
        mOutputBeverage = mBeverageChoicesArray[i];
      }
    }
    for (int i = 0; i<mChoiceArray.length; i++){
      if (mEntertainmentChoice.equals(mChoiceArray[i])){
        mTotalCost += mEntertainmentCostArray[i];
        mOutputEntertainment = mEntertainmentChoicesArray[i];
      }
    }
    mTotalCost += (mNumberOfPeople*5);
    return mTotalCost;
  }
}
