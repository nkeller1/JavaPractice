public class GreaterLessThan {
	public static void main(String[] args) {
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    // assgin a new varaible to see if studnet has enough credits to graduate
    boolean graduate = creditsEarned > creditsToGraduate;
    //student takes the seminar
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    // now do they have enough credits to graduate?
    boolean graduateAfterSeminar = creditsToGraduate < creditsAfterSeminar;
    System.out.println(graduate);
    System.out.println(graduateAfterSeminar);
	}
}
