class Ravi{
    public static void main(String[] args){
       String name = "Ravi";
       int age = 19;
       int rank = 2;
       int salary = 50000;
       float MembershipFee = 899.9f;
       double bonus = salary*0.12;
       int bonusInt = (int)bonus;
        System.out.println("**WELCOME CARD**");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Membership Fee: ₹" + MembershipFee);
        System.out.println("Annual Bonus (12%): ₹" + bonusInt);
    }
}
