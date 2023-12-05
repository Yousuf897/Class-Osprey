package tek.week_4.day_1;

public class LogicalNOT {

      /* Question 2: Weekend Alarm

        Imagine you have two boolean variables: isWeekend and isHoliday.
        On weekends or holidays, you prefer to sleep in, so you set your alarm to OFF.
        Otherwise, on weekdays that aren't holidays, you set your alarm to ON.
        Set any initial values for isWeekend and isHoliday.
        Determine the state of the alarm based on the values
*/

    public static void main(String[] args) {

        boolean isWeekend, isHoliday, setAlarm;

        isWeekend = false;
        isHoliday = true;
        setAlarm = false;

        //     false  || false  == false
       if ( isWeekend || isHoliday) {
           setAlarm = false;
       } else {
           setAlarm = true;
       }

        System.out.println("Alarm is: " + setAlarm);

       // if it's not holiday or weekend I will set the alarm to true, other than that I will set the alarm
        // to false;

        if ( !(isWeekend || isHoliday) ) {
            setAlarm = true;
        } else {
            setAlarm = false;
        }

        System.out.println("Alarm is: " + setAlarm);


        setAlarm = ( !(isHoliday || isWeekend) ) ? true : false;

        System.out.println("Alarm is: " + setAlarm);



    }

}
