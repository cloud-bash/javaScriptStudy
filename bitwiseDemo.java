class Main {
  static void bitwise() {
    Integer lowerlimit = 0;
    Integer upperlimit = 5;
    Integer operand = 9;
    String obw = Integer.toBinaryString(operand);
    System.out.println("\nBitwise OR (|)");
    for (Integer i = lowerlimit; i < upperlimit; i++ ) {
      String ibw = Integer.toBinaryString(i);
      String result = Integer.toBinaryString(i|operand);
      System.out.println(ibw + " | " + obw + " = " + result + " = " + (i | operand));
    }
    System.out.println("\nBitwise AND (&)");
    for (Integer i = lowerlimit; i < upperlimit; i++ ) {
      String ibw = Integer.toBinaryString(i);
      String result = Integer.toBinaryString(i&operand);
        System.out.println(ibw + " ^ " + obw + " = " + result + " = " + (i & operand));
    }
    System.out.println("\nBitwise XOR (^)");
    for (Integer i = lowerlimit; i < upperlimit; i++ ) {
      String ibw = Integer.toBinaryString(i);
      String result = Integer.toBinaryString(i^operand);
        System.out.println(ibw + " ^ " + obw + " = " + result + " = " + (i ^ operand));
    }
    System.out.println("\nBitwise Complement (~)");
    for (Integer i = lowerlimit; i < upperlimit; i++ ) {
      String result = Integer.toBinaryString(~i);
        System.out.println(~i + " = " + result );
    }
}
  
  public static void main(String[] args) {
  bitwise();
    }
  }
