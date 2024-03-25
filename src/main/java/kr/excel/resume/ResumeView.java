package kr.excel.resume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeView {
    private Scanner sc;
    public ResumeView(){
        sc = new Scanner(System.in);
    }
    public PersonInfo inputPersonInfo(){
        System.out.println("이름 입력");
        String name = sc.nextLine();

        System.out.println("전화번호 입력");
        int tel = sc.nextInt();

        return new PersonInfo(name,tel);
    }

    public List<Education> inputEducationList(){
        List<Education> educationList = new ArrayList<>();

        while(true){
            System.out.println("학력정보를 입력하세요. (q입력시 종료)");
            System.out.println("졸업년도 전공을 입력하세요)");

            String input = sc.nextLine();
            if(input.equalsIgnoreCase("q")){
                break;
            }

            String[] tokens = input.split(" "); //space 로 졸업년도 전공 나눔
            if(tokens.length != 2){
                System.out.println("잘못된 입력");
                continue;
            }
            String graduationYear = tokens[0];
            String major = tokens[1];

            educationList.add(new Education(graduationYear, major));
        }
        return educationList;

    }
    public List<Career>inputCareer(){
        List<Career> careersList = new ArrayList<>();
        while (true){
            System.out.println(" 재직 기간 입력 (종료시 q)");
            System.out.println("직무 입력");

            String input = sc.nextLine();
            if( input.equalsIgnoreCase("q")){
                break;
            }
            String[]tokens = input.split(" ");
            if(tokens.length != 2){
                System.out.println(" 잘못된 입력");
                continue;
            }
            String workPeriod = tokens[0];
            String jobTitle = tokens[1];
            careersList.add(new Career(workPeriod, jobTitle));
        }
        return careersList;
    }
    public String inputSelfIntroduction() {
        System.out.println("자기소개서를 입력 하세요.");
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = sc.nextLine()).trim().length() > 0){
            sb.append(line).append("\n");
        }
        return sb.toString().trim();
    }
}
