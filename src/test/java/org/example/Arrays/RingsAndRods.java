package org.example.Arrays;

import org.junit.Test;

public class RingsAndRods {
    public int countPoints(String rings) {
        int[][] store = new int[10][3];

        for(int i =0; i<rings.length(); i++){
            char color = rings.charAt(i);
            i = i+1;
            int ro = (int)rings.charAt(i) -48;
            switch(color){
                case 'R': store[ro][0]= 1;
                    break;
                case 'G': store[ro][1] = 1;
                    break;
                case 'B': store[ro][2] = 1;
                    break;
            }
        }

        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(store[i][j]+":");
            }
            System.out.println();
        }


        int ans =0;
        for(int i = 0; i< store.length; i++){
            if(store[i][0]+store[i][1]+store[i][2] ==3) {
                ans = i+1;
                break;
            }
        }


        return ans;
    }

    @Test
    public void runTest(){
        System.out.println(countPoints("G3R3R7B7R5B1G8G4B3G6"));
    }
}
