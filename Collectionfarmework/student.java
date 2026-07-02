class student <T extends Number>{
    String Name;
    T age;

    public student(String Name, T age){
        this.Name = Name;
        this.age = age;
    }
    <k extends Number> void displayGrades(k grade){
        if(grade instanceof Integer)
            System.out.println(grade);
            System.out.println(" ");

    } 
    public static void main(String[] args) {
        student<Integer> s = new student<>( "Anuj",24);
         s.displayGrades(7.8);
    }
   
    

}

