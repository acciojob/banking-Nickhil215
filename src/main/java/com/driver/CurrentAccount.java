package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only


    public CurrentAccount(String name, double balance, double minBalance, String tradeLicenseId) {
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
        char [] license=tradeLicenseId.toCharArray();
        int i=0;
        int j=license.length-1;
        while (i<license.length){
            while (j>=0){

            }
        }

    }
    public String reorganizeString(String S) {
        char ch[] = new char[26];
        int max = 0;
        for(char c: S.toCharArray()) {
            ch[c - 'a'] ++;
            if(ch[c-'a'] > ch[max]) max = c - 'a';
        }
        int len = S.length();
        if(len < 2 * ch[max] - 1) return "";
        int index = 0;
        char []res = new char[len];
        for(int i = 0 ; i < ch[max]; i++) {
            res[index] = (char)(max + 'a');
            index += 2;
        }
        ch[max] = 0;
        for(int i = 0 ; i < 26; i++) {
            int count = ch[i];
            while(count > 0 ) {
                if(index >= len ) index = 1;
                res[index] = (char)(i + 'a');
                index += 2;
                count --;
            }
        }

        return new String(res);
    }

}
