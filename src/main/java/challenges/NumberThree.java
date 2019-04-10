package challenges;

public class NumberThree {

    /**
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     *
     * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
     * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     *
     * The method should return a new string representing the input time in 24 hour format.
     *
     * timeConversion has the following parameter(s):
     *
     * Example:
     * s: 07:05:45AM
     * return: 07:05:45
     *
     * Example:
     * s: 07:05:45PM
     * return: 19:05:45
     *
     * @param s a string representing time in 12 hour format
     * @return the string s in 24 hour format
     */
    public String timeConversion(String s) {

        String militaryTime = "";

        String timeSubstring = s.substring(0,8);
        String dayTime = s.substring(9);
        //System.out.print(timeSubstring);
        String[] timeSplit = timeSubstring.split(":");

        int temp = Integer.parseInt(timeSplit[0]);

        if(dayTime.equals("AM")){
            if(temp == 12){
                temp = 00;
            }
            else{
                temp = temp;
            }
        }
        else if(dayTime.equals("PM")){
            if(temp == 12){
                temp = temp;
            }
            else{
                temp = temp + 12;
            }
        }

        if(temp < 12){
            String finalHour = "0" + Integer.toString(temp);
        }
        else{
            String finalHour = Integer.toString(temp);
        }

        militaryTime = finalHour + ":" + timeSplit[1] + ":" + timeSplit[2];

        return militaryTime;
    }
}
