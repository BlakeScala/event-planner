//java
public Integer foodCost() {
  for(int i = 0; i<mChoiceArray.length; i++) {
    if (mFoodChoice.equals(mChoiceArray[i])){
      mFoodCost = mFoodCostArray[i];
    }
  } return mFoodCost;
}
public Integer beverageCost() {
  for (int i = 0; i<mChoiceArray.length; i++){
    if (mBeverageChoice.equals(mChoiceArray[i])){
      mBeverageCost += mBeverageCostArray[i];
    }
  }
  return mBeverageCost;
}
public Integer entertainmentCost() {
  for (int i = 0; i<mChoiceArray.length; i++){
    if (mEntertainmentChoice.equals(mChoiceArray[i])){
      mEntertainmentCost += mEntertainmentCostArray[i];
    }
  }
  return mEntertainmentCost;
}
public Integer totalCost() {
  mTotalCost
  return mTotalCost;
}

//Tests

@Test
public void numberOfPeopleCost_getCostForPeople_Integer() {
  Event newParty = new Event(5,"3","2", "4");
  assertEquals((Integer)20, newParty.numberOfPeopleCost());
}

@Test
public void foodCost_getCostForFood_Integer() {
  Event newParty = new Event(5,"4","2", "4");
  assertEquals((Integer)120, newParty.foodCost());
}

@Test
public void beverageCost_getCostForBeverage_Integer() {
  Event newParty = new Event(5,"4","2", "4");
  assertEquals((Integer)30, newParty.beverageCost());
}

@Test
public void entertainmentCost_getCostForEntertainment_Integer() {
  Event newParty = new Event(5,"4","2", "4");
  assertEquals((Integer)150, newParty.entertainmentCost());
}
