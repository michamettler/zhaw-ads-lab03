package ch.zhaw.ads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Competitor implements Comparable<Competitor> {
    private final String name;
    private final String time;
    private int rank;

    public Competitor(int rank, String name, String time)  {
        this.rank = rank;
        this.name = name;
        this.time = time;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    private static long parseTime(String s)  {
        try {
            DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date date = sdf.parse(s);
            return date.getTime();
        } catch (Exception e) {System.err.println(e);}
        return 0;
    }

    private static String timeToString(int time) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        return df.format(new Date(time));
    }

    public String toString() {
        return ""+ rank + " "+name+" "+time;
    }

    @Override
    public int compareTo(Competitor o) {
        // TODO Implement
        return  0;
    }

    @Override
    public boolean equals (Object o) {
        // TODO Implement
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Implement
        return 0;
    }

}

class AlphaComparatorCompetitor implements Comparator<Competitor> {

    @Override
    public int compare(Competitor o1, Competitor o2) {
        // TODO Implement
        int c = 0;
        return c;
    }
}
