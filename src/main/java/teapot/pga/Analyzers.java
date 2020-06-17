package teapot.pga;

public class Analyzers {
    public static Analyzer getAnalyzer(int fileType) {
        Analyzer res = new AnalyzerBinary();
        if (fileType < Loc.BINARY_ID) {
            if (fileType == 10007 || fileType == 10098) {
                res = new AnalyzerHtml();
            } else {
                res = new AnalyzerJava();
            }
        }
        return res;
    }
}
