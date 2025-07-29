class Solution {
    public String[] solution(String[] names) {
        int length = (names.length+4)/5;
        int j = 0;
        String[] answer = new String[length];
        
        for(int i = 0; i < names.length; i += 5){
            answer[j] = names[i];
            j++;
        }
        
        return answer;
    }
}