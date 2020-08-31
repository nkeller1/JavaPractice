public class GreaterThanEqualTo {
  	public static void main(String[] args){
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
      // add recommendedWaterIntake to daysInChallenge
      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
      // check to see if you drank enough water
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      System.out.println(isChallengeComplete);
    }
}
