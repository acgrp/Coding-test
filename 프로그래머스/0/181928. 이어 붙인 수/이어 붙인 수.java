class Solution {
    public int solution(int[] num_list) {
        StringBuilder hol = new StringBuilder();
        StringBuilder zak = new StringBuilder();
        
        for(int num : num_list){
            if (num % 2 == 0){
                zak.append(num);
            } else {
                hol.append(num);
            }
        }
        int zaksu = Integer.parseInt(zak.toString());
        int holsu = Integer.parseInt(hol.toString());
        
        
        return zaksu + holsu;
    }
}