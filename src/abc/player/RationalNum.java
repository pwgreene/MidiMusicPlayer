package abc.player;

/**
 * A positive rational number
 *
 */
public class RationalNum implements Comparable<Object> {
    
    //Abstraction Function:
     //Represents a positive rational number, whose value is the ratio num:denom
    //Rep Invariant:
     //num > 0
     //denom > 0
    //Safety from rep exposure:
     //all fields are private, final, and immutable
     //no mutator methods, fields are immutable, class is immutable

    private final int num;
    private final int denom;

    /**
     * Constructs the rationalNumber num/denom
     * @param num 
     * @param denom
     */
    public RationalNum(int num, int denom) {
        this.num = num;
        this.denom = denom;
        checkRep();
    }
    /**
     * Parses a RationalNum from a String input
     * @param input a string of the form "x/y". x and y must be > 0
     */
    public RationalNum(String input){
        String[] numAndDenom = input.split("/");
        int num = Integer.parseInt(numAndDenom[0]);
        int denom = Integer.parseInt(numAndDenom[1]);
        this.num = num;
        this.denom = denom;
    }
    
    /**
     * @return the numerator of the RationalNum
     */
    public int getNum() {
        return num;
    }

    /**
     * @return the denominator of the RationalNum
     */
    public int getDenom() {
        return denom;
    }

    /**
     * Returns a double representing the RationalNum
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
     * Calculate the least common multiple of two integers.
     * @param a must be positive
     * @param b must be positive
     * @return Returns the LCM of a and b.
     */
    public static int LCM(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        int lcm =  (a / GCD(a, b)) * b;
        return lcm;
    }

    @Override
    public int compareTo(Object other) {
        RationalNum otherFrac = (RationalNum)other;
        return (this.getNum()*otherFrac.getDenom() - otherFrac.getNum()*this.getDenom());
    } 

    /**
     * @return a string representation of the RationalNumber (of the form num/denom)
     */
    @Override
    public String toString(){
        if (getDenom() == 1) {
            return "" + getNum();
        }
        return this.getNum() + "/" + this.getDenom();
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof RationalNum)) {
            return false;
        }
        RationalNum compareRationalNumber = (RationalNum)other;
        if (compareRationalNumber.num == this.num && compareRationalNumber.denom == this.denom ) {
            return true;
        }
        return false;
    }
    private void checkRep() {
        assert denom > 0;
        assert num > 0;
    }
}
