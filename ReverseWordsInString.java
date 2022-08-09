class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int leftPointer =0;
        int rightPointer = 0;
        s = reverseString(s);
        while (rightPointer < s.length()){
            if(s.charAt(leftPointer) == ' '){
                leftPointer++;
                rightPointer++;
            } else if (s.charAt(rightPointer) != ' '){
                rightPointer++;
            } else {
                sb.append(reverseString(s.substring(leftPointer, rightPointer)) + " ");
                leftPointer = rightPointer;
            }
        } 
        if(leftPointer < rightPointer && s.charAt(leftPointer) != ' '){
            sb.append(reverseString(s.substring(leftPointer, rightPointer)) + " ");
        }
        return sb.length() > 1 ? sb.toString().substring(0, sb.length() - 1) : "";
    }
    
    private String reverseString(String s){
        char array [] = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return new String(array);