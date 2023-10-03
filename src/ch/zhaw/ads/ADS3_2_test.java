package ch.zhaw.ads;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ADS3_2_test {
    List<Competitor> rankGood;
    List<Competitor> rankTest;

    public List<Competitor> createList(String rankingText) {
        List<Competitor> competitorList = new LinkedList<>();
        String[] lines = rankingText.split("\n");
        for (String line : lines) {
            String name = line.split(";")[0];
            String time = line.split(";")[1];
            competitorList.add(new Competitor(0, name,  time));
        }
        return competitorList;
    }

    @BeforeEach
    public void setUp() {
        String rangliste = "Mueller Stefan;02:31:14\n" +
                "Marti Adrian;02:30:09\n" +
                "Kiptum Daniel;02:11:31\n" +
                "Ancay Tarcis;02:20:02\n" +
                "Kreibuhl Christian;02:21:47\n" +
                "Ott Michael;02:33:48\n" +
                "Menzi Christoph;02:27:26\n" +
                "Oliver Ruben;02:32:12\n" +
                "Elmer Beat;02:33:53\n" +
                "Kuehni Martin;02:33:36\n";
        rankGood = createList(rangliste);
        rankTest = new RankingListServer().createList(rangliste);
    }

    @Test
    public void testCreateList() {
        assertEquals(rankGood.size(), rankTest.size(), "length");
        for (int i = 0; i < rankGood.size();i++) {
            assertEquals(rankGood.get(i).toString(), rankTest.get(i).toString(), "rangliste["+i+"]");
        }
    }
}
