package com.aer.sample.numbertoordinal;

public class NumberToOrdinalConverter {

  private NumberToOrdinalConverter() {
    throw new IllegalStateException("Utility class");
  }

  public static String getOrdinal(Integer number) {
    if (isTeenNumber(number)) {
      return getOrdinalForTeen(number);
    }
    String lastDigit = getLastDigit(number);
    String ordinalIndicator = getOrdinalIndicator(lastDigit);

    return getOrdinal(number, ordinalIndicator);
  }

  private static String getOrdinal(Integer number, String ordinalIndicator) {
    return number.toString() + ordinalIndicator;
  }

  private static String getOrdinalIndicator(String lastDigit) {
    String ordinalIndicator;
    switch (lastDigit) {
      case "0":
        ordinalIndicator = "";
        break;
      case "1":
        ordinalIndicator = "st";
        break;
      case "2":
        ordinalIndicator = "nd";
        break;
      case "3":
        ordinalIndicator = "rd";
        break;
      default:
        ordinalIndicator = "th";

    }
    return ordinalIndicator;
  }

  private static String getOrdinalForTeen(Integer number) {
    return number.toString() + "th";
  }

  private static boolean isTeenNumber(Integer number) {

    String[] digits = number.toString().split("");
    return digits.length > 1 && digits[digits.length - 2].equals("1");
  }

  private static String getLastDigit(Integer number) {
    String[] literalNumber = String.valueOf(number).split("");
    return literalNumber[literalNumber.length - 1];
  }
}
