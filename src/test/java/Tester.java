import org.junit.Test;

public class Tester {

  @Test
  public void testMe(){
    System.out.println("Get Username Property "+DBPropService.getPropertyFromFile("qa.username"));
    System.out.println("Get Password Property "+DBPropService.getPropertyFromFile("qa.password"));
  }
}
