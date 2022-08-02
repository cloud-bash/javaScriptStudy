class Main {
  static void bitwise() {
    Integer lowerlimit = 0;
    Integer upperlimit = 3;
    Integer operand = 9;
    //obw = operand bitwise
    String obw = Integer.toBinaryString(operand);
    //number of characters in bitwise operand as string
    int leno = obw.length();
    System.out.println("\nBitwise OR (|)");
    //until lowerlimit is not less than upperlimit, increase i by 1
    for (Integer i = lowerlimit; i < upperlimit; i++ ) {
      //ibw = i bitwise
      String ibw = Integer.toBinaryString(i);
      //number of characters in bitwise i as string
      int leni = ibw.length();
      //add 0's to match the bitwise opwerand
      while (leni < leno) {
        ibw = "0" + ibw;
        leni = ibw.length();
      } 
      //perform bitwise calculation
      String result = Integer.toBinaryString(i|operand);
      //display result as well as the equation in 1's and 0's
      System.out.println(ibw + " | " + obw + " = " + result + " = " + (i | operand));
    }
    // System.out.println("\nBitwise AND (&)");
    // for (Integer i = lowerlimit; i < upperlimit; i++ ) {
    //   String ibw = Integer.toBinaryString(i);
    //   String result = Integer.toBinaryString(i&operand);
    //     System.out.println(ibw + " ^ " + obw + " = " + result + " = " + (i & operand));
    // }
    // System.out.println("\nBitwise XOR (^)");
    // for (Integer i = lowerlimit; i < upperlimit; i++ ) {
    //   String ibw = Integer.toBinaryString(i);
    //   String result = Integer.toBinaryString(i^operand);
    //     System.out.println(ibw + " ^ " + obw + " = " + result + " = " + (i ^ operand));
    // }
    // System.out.println("\nBitwise Complement (~)");
    // for (Integer i = lowerlimit; i < upperlimit; i++ ) {
    //   String result = Integer.toBinaryString(~i);
    //     System.out.println(~i + " = " + result );
    // }
}
  
  public static void main(String[] args) {
  bitwise();
    }
  }
