package kr.excel.resume;

public class Education {
    private String graduationYear;
    private String major;
    public Education(){}

    public Education(String graduationYear, String major) {
        this.graduationYear = graduationYear;
        this.major = major;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
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
