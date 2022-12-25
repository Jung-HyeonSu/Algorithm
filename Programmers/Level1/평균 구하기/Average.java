class Average {
    public int solution(String t, String p) {
        int answer = 0;
        String splitT[] = {};
        for(int i=0;;i++){
            if(i+2==t.length()){
                break;
            }
            splitT[i] = t.substring(i,i+2);
            System.out.println(splitT[i]);
        }
        return answer;
    }
}