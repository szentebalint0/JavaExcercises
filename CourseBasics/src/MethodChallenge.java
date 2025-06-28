public class MethodChallenge {
    public static void main(String[] args) {


        System.out.println(getDurationString(0));

        System.out.println(getDurationString(6, 138));
    }

    public static String getDurationString(int seconds) {

        if (seconds <= 0) return "0h 0m 0s";

        int hours = seconds / 3600;
        int minutes =  (seconds % 3600) / 60;
        int secs = seconds % 60;

        String result = hours + "h " + minutes + "m " + secs + "s" ;

        return result;
    }

    public static String getDurationString(int minutes, int seconds) {

        int totalSeconds = minutes *60 + seconds;

        return getDurationString(totalSeconds);

    }

}
