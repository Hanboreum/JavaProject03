package kr.excel.resume;

public class PersonInfo {
    private String name;
    private  int tel;

    public PersonInfo(){}
    public PersonInfo(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", tel=" + tel +
                '}';
    }
}
