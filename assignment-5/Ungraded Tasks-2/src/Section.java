public class Section {
    public static int section_count = 0;

    public int sec_id,student_id;
    public String teacher_name,student_name;
    public Section(){

    }



    public Section(String teacher_name) {
        section_count++;
        this.sec_id = section_count;
        this.teacher_name = teacher_name;
    }
}