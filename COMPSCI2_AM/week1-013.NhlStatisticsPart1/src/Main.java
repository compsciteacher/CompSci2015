
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top twenty five by penalty minutes");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
