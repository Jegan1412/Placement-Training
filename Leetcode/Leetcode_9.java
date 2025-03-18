class Solution {
    public boolean isPalindrome(int x) {
        int y=0,temp=x;
        if(x<0){
            return false;
        }
        while(temp!=0){
            y=(y*10) + (temp%10);
            temp=temp/10;
        }
        if(x==y){
            return true;
        }
        return false;
    }
}