class Main {
  public static char formatString(String raw) {
    String copy = raw;

    while(copy.length() > 1) {
      int sum = 0;
      for (int i = 0; i < copy.length(); i++){
          String c = String.valueOf(copy.charAt(i));        
          sum += Integer.parseInt(c, 16);
      }
      copy = Integer.toHexString(sum);
    }
    
    return copy.toUpperCase().charAt(0);
  }
  
  public static char sumOfLastRow(String s, String d, int r) {
    int dInt = Integer.parseInt(d, 16);
    int num = 0;

    for(int i = 1; i < r; i++) {
      num += i;
    }

    int startNum = Integer.parseInt(s, 16) + (num-1) * dInt;
    String rawString = "";

    for(int i = 0; i < r; i++) {
      rawString = rawString.concat(Integer.toHexString(startNum + (i+1)*dInt));
    }

    return formatString(rawString);
  }

  public static void main(String[] args) {
    System.out.println("Answer: " + sumOfLastRow("A", "9", 5));
    System.out.println("Answer: " + sumOfLastRow("ABC", "F", 4));
    System.out.println("Answer: " + sumOfLastRow("BAD", "50", 10));
    System.out.println("Answer: " + sumOfLastRow("FED", "ABC", 25));
    System.out.println("Answer: " + sumOfLastRow("184", "231", 35));
  }
}
