package kr.excel.resume;

public class Education {
    private int graduationYear;
    private String major;
    public Education(){}

    public Education(int graduationYear, String major) {
        this.graduationYear = graduationYear;
        this.major = major;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Education{" +
                "graduationYear=" + graduationYear +
                ", major='" + major + '\'' +
                '}';
    }
}
