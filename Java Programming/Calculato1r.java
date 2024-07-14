Class Student implements Cloneable
{
    public string name;
    public int marks;
    public int age;

    public Student(String str,int a,int b)
    {
        this.name = str;
        this.marks = a;
        this.age = b;
    }

    public object clone() throws Exception
{
    return super.clone();
}
}



class CloneDemo
{
    public static void main(String Args[])
    {
        try
        {
        Student obj1 = new Student("Amit",55,44);
        Student obj2 = (Student)obj1.clone();

        System.out.println("Name : "+obj1.marks);
        System.out.println("Name : "+obj1.age);
        System.out.println("Name : "+obj1.name);

        System.out.println("Name : "+obj2.marks);
        System.out.println("Name : "+obj2.age);
        System.out.println("Name : "+obj2.name);

    }
    catch(Exception obj)
    {}
}