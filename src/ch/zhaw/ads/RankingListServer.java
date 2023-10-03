package ch.zhaw.ads;

import java.util.List;

public class RankingListServer implements CommandExecutor {

    public List<Competitor> createList(String rankingText) {
        // TODO Implement
        return null;
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
