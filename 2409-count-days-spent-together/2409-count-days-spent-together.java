
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aA = getDay(arriveAlice);
        int lA = getDay(leaveAlice);
        int aB = getDay(arriveBob);
        int lB = getDay(leaveBob);
        int start = Math.max(aA, aB);
        int end = Math.min(lA, lB);
        if (start > end) 
        {
            return 0;
        }
        return end - start + 1;
    }
    public int getDay(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        for (int i = 0; i < month - 1; i++) 
        {
            day += days[i];
        }
        return day;
    }
}
