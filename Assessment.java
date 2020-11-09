
package com.company;

import java.util.Arrays;
import java.util.ArrayList;

public class Assessment {

    public Assessment(){}

    public static void main(String[] args) {
//        run code here
            }

    public int findMissingNumber(int[] incomplete){
        int missingNumber=0;
        Arrays.sort(incomplete);
        for (int i=0; i<incomplete.length-1; i++){
            if (incomplete[i] != i+1){
              missingNumber = i+1 ;
              break;
            }
        }
        return missingNumber;
    }



    public String reverseString(String string){
//        String string = "Lorem at";
        ArrayList<Character> reversed = new ArrayList<>();
        char[] chars = string.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for (char c : chars) {
            arr.add(c);
        }

        for (int i=3; i<chars.length; i+=4) {
            int lower =i-3;
            for (int j = i; j >=lower ; j--) {

                reversed.add(chars[j]);
            }
        }

        String reversedString = "";
        for (char c : reversed) {
            String str = Character.toString(c);
            reversedString = reversedString + str;

        }
        return reversedString;
    }

    public int findAllPossibleJumps(int width){
//        width is the total length the rat will have to jump to cross the river

        int maxNumberOfJumps = (int) Math.ceil(width/1f);
        int minNumberOfJumps = (int) Math.ceil(width/2f);

        int possibleNumberOfJumps = 0;
        for (int jumps=minNumberOfJumps; jumps<=maxNumberOfJumps; jumps++){

            for (int i=0; i<22; i++ ){
                possibleNumberOfJumps+=jumps;
            }


        }

        return possibleNumberOfJumps;
    }

}
