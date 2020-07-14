

import java.util.*;
import java.lang.*;
import java.io.*;

//NumberDictionary
//Example N=11. Output – {1, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9}; N<=10^8.

class NumberDictionary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N  = 221;
		
		for (int i =1; i <= 9; i++) {
		        System.out.println(i);
		        getNextDigit(i, N, 0);
		}
	}
	
    public static void getNextDigit(int val, int N, int unit) {
        int newVal = 0;
        String output = val + "" + unit;
        if(Integer.parseInt(output) <= N) {
            newVal = Integer.parseInt(output);
            System.out.println(newVal);
            if(unit == 9)
                getNextDigit(newVal, N, 0) ;  
            else {
                getNextDigit(newVal, N, 0) ;  
                getNextDigit(val, N, unit+1) ;   
            }
        } 
        return;
    }
}

