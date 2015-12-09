package abc.player;

/**
 * A nonnegative rational number
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
     * @param num must be nonnegative
     * @param denom must be posititve
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
     * Calculate the least common multiple of two integers.
     * @param x must be positive
     * @param y must be positive
     * @return Returns the LCM of a and b.
     */
    public static int LCM(int x, int y) {
        int lcm;
        if (x > y || x == y) {
            lcm = y;
        } else {
            lcm = x;
        }
        while (true) {
            if (lcm % x != 0 || lcm % y != 0) {
                lcm++;
            } else {
                return lcm;
            }
        }
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
        assert num >= 0;
    }
}
