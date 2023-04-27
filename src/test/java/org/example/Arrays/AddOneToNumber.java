package org.example.Arrays;

import org.junit.Test;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry =1;
        for (int i = A.size()-1; i >= 0; i--) {
            int result = A.get(i)+carry;
            if(result<=9){
                A.remove(i);
                A.add(i, result);
                carry=0;
                break;
            }else {
                A.remove(i);
                A.add(i, result%10);
                carry = result/10;
            }
        }
        if(carry!=0)  {
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(carry);
            a.addAll(A);
            return a;
        }
        for (int i = 0; i < A.size(); i++) {
            if(A.get(0)==0) A.remove(0);
        }
        return A;
    }


    @Test
    public void runTest(){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(9);
        A.add(9);
        A.add(1);
        System.out.println(plusOne(A));
    }
}
