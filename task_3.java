@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		{ 10, false},
        { 16, false},
        { 18, true},
        { 25, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    int userAge;
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Статус совершеннолетия определён неверно", result, isAdult);
	}
}
