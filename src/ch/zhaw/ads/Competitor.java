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
        return Long.compare(parseTime(time), parseTime(o.time));
    }

    @Override
    public boolean equals (Object o) {
        if (o instanceof Competitor) {
            return this.getName().equals(((Competitor) o).getName()) &&
                    this.getTime().equals(((Competitor) o).getTime());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

}

class AlphaComparatorCompetitor implements Comparator<Competitor> {

    @Override
    public int compare(Competitor o1, Competitor o2) {
        int c = o1.getName().compareTo(o2.getName());
        if (c == 0) {
            return o1.compareTo(o2);
        }
        return c;
    }
}
