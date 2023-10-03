package ch.zhaw.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RankingListServer implements CommandExecutor {

    public List<Competitor> createList(String rankingText) {
        List<Competitor> list = new ArrayList<>();
        for (String line : rankingText.split("\n")) {
            String[] splitLine = line.split(";");
            list.add(new Competitor(0, splitLine[0], splitLine[1]));
        }
        return list;
    }

    public String createSortedText(List<Competitor> competitorList) {
        Collections.sort(competitorList);
        StringBuilder sb = new StringBuilder();

        int rank = 1;
        for (Competitor competitor : competitorList) {
            competitor.setRank(rank++);
            sb.append(competitor).append("\n");
        }
        return sb.toString();
    }

    public String createNameList(List<Competitor> competitorList) {
        Comparator<Competitor> comp = new AlphaComparatorCompetitor();
        competitorList.sort(comp);

        StringBuilder sb = new StringBuilder();
        for (Competitor competitor : competitorList) {
            sb.append(competitor).append("\n");
        }
        return sb.toString();
    }

    public String execute(String rankingList) {
        List<Competitor> competitorList = createList(rankingList);
        return "Rangliste\n" + createSortedText(competitorList);
    }
}
