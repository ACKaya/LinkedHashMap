public class Student {
    private int note;
    private String stuName;
    private int no;
    Student(int note,String stuName,int no){
        this.note=note;
        this.stuName=stuName;
        this.no=no;
    }
    public int getNote(){
        return this.note;
    }
    public void setNote(int note){
        this.note=note;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
