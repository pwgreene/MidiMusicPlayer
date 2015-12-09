package abc.player;

public class RationalNum implements Comparable<Object> {

     private final int num;
     private final int denom;

     /**
      * Constructs the rationalNumber num/denom
      * @param num 
      * @param denom
      */
     public RationalNum(int num, int denom) {
         if (denom == 0) {
             throw new IllegalArgumentException("Cannot have a denom of 0");
         }
         this.num = num;
         this.denom = denom;
     }
     
     /**
      * Creates a RationalNumber from a string
      * @param RationalNumberAsString a string of the form "x/y", where y cannot be 0
      */
     public RationalNum(String rationalString){
         String[] fracArray = rationalString.split("/");
         int num = Integer.parseInt(fracArray[0]);
         int den = Integer.parseInt(fracArray[1]);
         if(den == 0){
             throw new IllegalArgumentException("Cannot have a denom of 0");
         }
         this.num = num;
         this.denom = den;
     }
     
     /**
      * @return the num of the RationalNumber
      */
     public int getNum() {
         return num;
     }
     
     /**
      * @return the denom of the RationalNumber
      */
     public int getDenom() {
         return denom;
     }
     
     /**
      * Returns a double representing the RationalNumber
      */
     public double getRationalNumber() {
         return ( (double) num) / ( (double) denom);
     }
     
     /**
      * Using Euclid's algorithm, this calculates the greatest common denom of two integers.
      * @param a  Must be a positive integer.
      * @param b Must be a positive integer.
      * @return Returns the greatest common denom.
      */
     public static int GCD(int a, int b) {
         if (b == 0) {
             return a;
         }
         if (b > a) {
             int placeHolder = b;
             b = a;
             a = placeHolder;
         }
         return GCD(b, a % b);
     }
     
     /**
      * This calculates the least common multiple of two integers.
      * Note: this method does not handle large numbers so inputs must be within a reasonable range.
      * @param a Must be a positive integer.
      * @param b Must be a positive integer.
      * @return Returns the least common multiple.
      */
     public static int LCM(int a, int b) {
         if (a == 0 && b == 0) {
             return 0;
         }
         int lcm =  (a / GCD(a, b)) * b;
         return lcm;
      }

     /**
      * Determines whether two RationalNumbers
      * @param other the other RationalNumber to be compared to - must be of type RationalNumber and must not be null
      * @return 0 if the RationalNumbers are equal, positive if other is smaller, negative if other is larger
      */
     @Override
     public int compareTo(Object other) {
         /*
          * Although we specify that other must be a non-null RationalNumber, we double check
          */
         if(!(other instanceof RationalNum))
             throw new IllegalArgumentException("Can only compare this to a RationalNumber object");
         
         /*
          * If we are comparing RationalNumbers a/b and c/d, we consider the quantity:
          * ad - bc
          * which is:
          * 0 if a/b = c/d
          * >0 if a/b > c/d
          * <0 if a/b < c/d
          * 
          *  We apply this rule to the case where
          *  a/b is this
          *  c/d is other
          */
         
         RationalNum otherFrac = (RationalNum)other;
         return (this.getNum()*otherFrac.getDenom() - otherFrac.getNum()*this.getDenom());
     } 
     
     /**
      * @return the double representation of this RationalNumber
      */
     public double toDouble(){
         return this.getNum()*1.0/this.getDenom();
     }
     
     /**
      * @return a string representation of the RationalNumber (of the form num/denom)
      */
     @Override
     public String toString(){
         return String.format("%d/%d", this.getNum(), this.getDenom());
     }
     
     @Override
     public boolean equals(Object other) {
         if(!(other instanceof RationalNum))
             return false;
         RationalNum compareRationalNumber = (RationalNum)other;
         if (compareRationalNumber.num == this.num && compareRationalNumber.denom == this.denom ) {
             return true;
         } else {return false;}
     }
}
