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

        //System.out.print(s);
        String militaryTime = "";

        String timeSubstring = s.substring(0,8);
        String dayTime = s.substring(8,10);
        //System.out.print(timeSubstring);
        //System.out.print(dayTime);
        String[] timeSplit = timeSubstring.split(":");

        int temp = Integer.parseInt(timeSplit[0]);
        //System.out.print("temp");

        if(dayTime.equals("AM")){
            if(temp == 12){
                temp = 0;
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
                temp += 12;
            }
        }

        String finalHour = "";

        if(temp < 12){
            finalHour = "0" + Integer.toString(temp);
        }
        else{
            finalHour = Integer.toString(temp);
        }

        militaryTime = finalHour + ":" + timeSplit[1] + ":" + timeSplit[2];

        return militaryTime;
    }
}
