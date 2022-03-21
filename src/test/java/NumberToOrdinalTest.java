import com.aer.sample.numbertoordinal.NumberToOrdinalConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberToOrdinalTest {

  @Test
  void zeroDigitNumberTest(){
    String ordinal=NumberToOrdinalConverter.getOrdinal(0);
    Assertions.assertEquals("0",ordinal);
  }


  @Test
  void oneDigitNumberTest(){
    String ordinal=NumberToOrdinalConverter.getOrdinal(9);
    Assertions.assertEquals("9th",ordinal);
  }

  @Test
  void twoDigitNumberTest(){
    String ordinal=NumberToOrdinalConverter.getOrdinal(91);
    Assertions.assertEquals("91st",ordinal);
  }

  @Test
  void twoDigitTeenNumberTest(){
    String ordinal=NumberToOrdinalConverter.getOrdinal(11);
    Assertions.assertEquals("11th",ordinal);
  }

  @Test
  void threeDigitNumberTest(){
    String ordinal=NumberToOrdinalConverter.getOrdinal(923);
    Assertions.assertEquals("923rd",ordinal);
  }

  @Test
  void threeDigitTeenNumberTest(){
    String ordinal=NumberToOrdinalConverter.getOrdinal(913);
    Assertions.assertEquals("913th",ordinal);
  }


}
