import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TestCalculator {

  Calculator calculator;

  @Before
  public void setup() {
    calculator = new Calculator();
  }


  @Test
  public void addTest() {
    assertThat(calculator.add(1, 1)).isEqualTo(2);

  }


}
