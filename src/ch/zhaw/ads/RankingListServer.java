package ch.zhaw.ads;

import java.util.LinkedList;
import java.util.List;

public class RankingListServer implements CommandExecutor {

    public List<Competitor> createList(String rankingText) {
        List<Competitor> list = new LinkedList<>();
        for (String line : rankingText.split("\n")) {
            String[] splitLine = line.split(";");
            list.add(new Competitor(0, splitLine[0], splitLine[1]));
        }
        return list;
    }

    public String createSortedText(List<Competitor> competitorList) {
        // TODO Implement
        return "";
    }

    public String createNameList(List<Competitor> competitorList) {
        // TODO Implement
        return "";
    }

    public String execute(String rankingList) {
        List<Competitor> competitorList = createList(rankingList);
        return "Rangliste\n" + createSortedText(competitorList);
    }
}
