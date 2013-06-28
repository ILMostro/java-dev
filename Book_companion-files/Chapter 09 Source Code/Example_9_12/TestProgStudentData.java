
public class TestProgStudentData
{
    public static void main(String[] args)
    {
        StudentData student1 =
                    new StudentData("John", "Doe",
                               89, 78, 95, 63, 94);

        StudentData student2 =
                    new StudentData("Lindsay", "Green",
                               92, 82, 90, 70, 87, 99);

        System.out.println(student1);
        System.out.println(student2);
    }
}
