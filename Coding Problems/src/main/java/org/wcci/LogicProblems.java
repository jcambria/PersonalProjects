package org.wcci;

public class LogicProblems {
    /*
     * squirrelPlay()
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
     * 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     * Examples:
     * - squirrelPlay(70, false) → true
     * - squirrelPlay(95, false) → false
     * - squirrelPlay(95, true) → true
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        if (temp >= 60 && temp <= 100 && isSummer)
            return true;
        else if (!isSummer && temp >= 60 && temp <= 100)
            return true;

    {
        return false;
    }
}

    /*
     * nearTen()
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     *
     * Examples:
     * - nearTen(12) → true
     * - nearTen(17) → false
     * - nearTen(19) → true
     */
    public boolean nearTen(int num) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        if(num % 10 <= 2 || num % 10 >=8) {
            return true;
        } else {
            return false;
        }

    }

}

