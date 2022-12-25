class Solution {
    public String solution(String s) {
        String str[]= s.split(" ");
        String max = str[0];
        String min = str[0];
        for(int i=1;i<str.length;i++){
            if(Integer.parseInt(max)<Integer.parseInt(str[i])){
                max = str[i];
            }
            if(Integer.parseInt(min)>Integer.parseInt(str[i])){
                min = str[i];
            }
        }
        return min + " "+max;
    }
}