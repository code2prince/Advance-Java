package Practice.String;


import java.util.List;

public class ReportService {
    public StringBuilder generateReport(List<String> rows) {
        StringBuilder report = new StringBuilder("");

        for(String row : rows) {
            if(row!=null) {
                report = new StringBuilder(report + row + "\n");
            }
        }
        return report;
    }
}

