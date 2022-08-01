class Main {
  static void bitwise() {
      Integer upperlimit = 5;
      Integer operand = 2;
    System.out.println("\n Bitwise XOR (^)");
    for (Integer i = 0; i < upperlimit; i++ ) {
      String ibw = Integer.toBinaryString(i);
      String obw = Integer.toBinaryString(operand);
      String result = Integer.toBinaryString(i^operand);
        System.out.println(ibw + " ^ " + obw + " = " + result + " = " + (i ^ operand));
    }
    // System.out.println("\n|");
    // for (Integer i = 0; i < upperlimit; i++ ) {
    //     System.out.println(i | operand);
    // }
    // System.out.println("\n&");
    // for (Integer i = 0; i < upperlimit; i++ ) {
    //     System.out.println(i & operand);
    // }    
    // System.out.println("\n~");
    // for (Integer i = 0; i < upperlimit; i++ ) {
    //     System.out.println(~i);
    // }
}
  
  public static void main(String[] args) {
  bitwise();
    }
  }
