class Student{
    private int id;
    public void setId(int id){
        this.id=id;
    }
    public int getId(int id)
    {
        return id;
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.setId(3);
       System.out.print(s1.getId(3));
    }
}