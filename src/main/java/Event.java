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
  private String[] mEntertainmentInput = {"None", "Equipment", "House DJ", "Acousic Guitarist", "Band"};
  private Integer mTotalCost = 0;
  public String outputFood;

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

  public Integer calculateTotalCost(){
    for(int i = 0; i<mChoiceArray.length; i++) {
      if (mFoodChoice.equals(mChoiceArray[i])){
        mTotalCost += mFoodCostArray[i];
      }
    }
    for (int i = 0; i<mChoiceArray.length; i++){
      if (mBeverageChoice.equals(mChoiceArray[i])){
        mTotalCost += mBeverageCostArray[i];
      }
    }
    for (int i = 0; i<mChoiceArray.length; i++){
      if (mEntertainmentChoice.equals(mChoiceArray[i])){
        mTotalCost += mEntertainmentCostArray[i];
      }
    }
    mTotalCost += (mNumberOfPeople*5);
    return mTotalCost;
  }

  public String outputMessageFood() {
    for (int i = 0; i<mChoiceArray.length; i++){
      if (mFoodChoice.equals(mChoiceArray[i])){
        outputFood = mFoodChoicesArray[i];
      }
    }return outputFood;
  }
}
