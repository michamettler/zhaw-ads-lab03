package ch.zhaw.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.StreamSupport;

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
        Collections.sort(competitorList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < competitorList.size(); i++) {
            sb.append(i + 1).append(" ").append(competitorList.get(i).getName()).append(" ").append(competitorList.get(i).getTime()).append("\n");
        }
        return sb.toString();
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
