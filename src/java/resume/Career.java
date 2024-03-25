package java.resume;

public class Career {
    private int workPeriod;
    private String jobTitle;
    public Career(){}
    public Career(int workPeriod, String jobTitle) {
        this.workPeriod = workPeriod;
        this.jobTitle = jobTitle;
    }

    public int getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(int workPeriod) {
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
                "workPeriod=" + workPeriod +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
