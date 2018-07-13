/**
 *
 * @author vipinsharma
 * @date Jul 13, 2018
 * @time 12:50:45 PM
 */

package com.interview.strings;

public class StringsAndArrays {
    //determine if all the characters in the string is unique
    public boolean isUnique(String str)
        throws Exception 
    {
        int vector = 0;
        for (int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            if ((vector & (1 << val)) > 0){
                return false;
            }
            
            vector |= (1 << val);
        }
        
        return true;
    }
    
}
