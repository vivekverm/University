public class Student
{
    String S_Name;
    int Age;
    String program;

    public Student(String s_Name, int age, String program)
    {
        S_Name = s_Name;
        Age = age;
        this.program = program;
    }
    public void Dis_student_info()
    {
        S_Name="Name of the Student";
        Age=18-25;
        program="Gra_Stu // Res_Stu";
    }
}
class Graduate_Student extends Student
{
    int Per_Marks_12;
    String Stream;

    public Graduate_Student(String s_Name, int age, String program, int per_Marks_12, String stream)
    {
        super(s_Name, age, program);
        Per_Marks_12 = per_Marks_12;
        Stream = stream;
    }
    public void Dis_student_info()
    {
        System.out.println(S_Name="Hero");
        System.out.println(Age=19);
        System.out.println(program="Res_Stu");
        System.out.println(Per_Marks_12=80);
        System.out.println(Stream="Science");
    }
}
class Research_Student extends Student
{
    String specialization;
    int Exp_of_Year;

    public Research_Student(String s_Name, int age, String program, String specialization, int exp_of_Year)
    {
        super(s_Name, age, program);
        this.specialization = specialization;
        Exp_of_Year = exp_of_Year;
    }
    public void Dis_sutdent_info()
    {
        System.out.println(S_Name="Dracula");
        System.out.println(Age=20);
        System.out.println(program="Gra_Stu");
        System.out.println(specialization="Programming");
        System.out.println(Exp_of_Year=5);
    }
}
class Test{
    public static void main(String[] args) {
        Graduate_Student obj=new Graduate_Student("Vivek",20,"Gra_Stu",90,"Science");
        obj.Dis_student_info();
        System.out.println();
        Research_Student obj_1=new Research_Student("kia",12,"science","AI",3);
        obj_1.Dis_sutdent_info();
    }
}
