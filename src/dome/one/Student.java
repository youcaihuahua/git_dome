package dome.one;
class Student extends  Person{
    private String sno;
    private int score;
    public Student(){}
    public Student(String a,int b,String c,int d){
        super(a,b);
        sno = c;
        score = d;
    }
    public String getSno() {return sno;}
    public void setSno(String sno) {this.sno = sno;}
    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}
    @Override
    public void introduce() {System.out.println("名字 "+super.getName()+"年龄 "+super.getAge()+"学号 "+sno + "成绩 "+score);}
    void work(){
        System.out.println("学生在学习");
    }
}
