package kr.excel.resume;

public class Career {
    private String workPeriod;
    private String jobTitle;
    public Career(){}

    public Career(String workPeriod, String jobTitle) {
        this.workPeriod = workPeriod;
        this.jobTitle = jobTitle;
    }

    public String getWorkPeriod() {
        return workPeriod;
    }

    public void setWordPeriod(String workPeriod) {
        this.workPeriod = workPeriod;
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
                "wordPeriod='" + workPeriod + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
