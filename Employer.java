class Employer {
  int salary = 12000;
  int timeWorked = 40;
}

class Employee extends Employer {
  int amountOfWeeks = 3;

  public static void main(String[] args) {
    Employee john = new Employee();
    System.out.println("John's salay: " + john.salary);
    System.out.println("Time worked thoughout the week: " + john.timeWorked);
    System.out.println("Amount of weeks worked: " + john.amountOfWeeks);
  }
}
