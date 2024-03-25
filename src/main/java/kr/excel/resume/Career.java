package kr.excel.resume;

public class Career {
    private String wordPeriod;
    private String jobTitle;
    public Career(){}

    public Career(String wordPeriod, String jobTitle) {
        this.wordPeriod = wordPeriod;
        this.jobTitle = jobTitle;
    }

    public String getWordPeriod() {
        return wordPeriod;
    }

    public void setWordPeriod(String wordPeriod) {
        this.wordPeriod = wordPeriod;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Career{" +
                "wordPeriod='" + wordPeriod + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
