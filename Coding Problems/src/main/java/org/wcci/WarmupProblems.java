package org.wcci;

public class WarmupProblems {

    /*
     * stringTimes()
     *
     * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
     * string.
     *
     * Examples:
     * - stringTimes("Hi", 2) → "HiHi"
     * - stringTimes("Hi", 3) → "HiHiHi"
     * - stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        String s = "";
        for(int i=0; i < n; i++) {
            s = s + str;
        }
        return s;
    }

    /*
     * icyHot()
     *
     * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
     *
     * Examples:
     * - icyHot(120, -1) → true
     * - icyHot(-1, 120) → true
     * - icyHot(2, 120) → false
     */
    public boolean icyHot(int temp1, int temp2) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0) {
            return true;
        } else {
            return false;
        }
    }
}
