import java.util.Scanner;

class Q11_Person {
    String name;
    String gender;
    String address;
    int age;

    Q11_Person() {
        name = " ";
        gender = " ";
        address = " ";
        age = 0;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Name:");
        name = sc.nextLine();
        System.out.println("Enter Gender-M/F:");
        gender = sc.nextLine();
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("\nName : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }
}

class Employee extends Q11_Person {
    String Empid;
    String Company_name;
    String Qualification;
    int Salary;

    Employee() {
        Empid = " ";
        Company_name = " ";
        Qualification = " ";
        Salary = 0;
    }

    void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Empid:");
        Empid = sc.nextLine();
        System.out.println("Enter Company Name:");
        Company_name = sc.nextLine();
        System.out.println("Enter Qualification:");
        Qualification = sc.nextLine();
        System.out.println("Enter Salary:");
        Salary = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("Empid : " + Empid);
        System.out.println("Company Name : " + Company_name);
        System.out.println("Qualification : " + Qualification);
        System.out.println("Salary : " + Salary);
    }
}

class Teacher extends Employee {
    String Dept;
    String Subj;
    String Tid;

    Teacher() {
        Dept = " ";
        Subj = " ";
        Tid = " ";
    }

    void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department Name:");
        Dept = sc.nextLine();
        System.out.println("Enter Subject:");
        Subj = sc.nextLine();
        System.out.println("Teacher Id:");
        Tid = sc.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Department : " + Dept);
        System.out.println("Subject : " + Subj);
        System.out.println("Teacher id : " + Tid);
    }
}

class Q11_personEmployee {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of teacher details: ");
        int n = s.nextInt();
        Teacher t[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Teacher();
            t[i].read();
        }
        System.out.print("\nTEACHER DETAILS\n");
        System.out.print("----------------");
        for (int j = 0; j < n; j++) {
            t[j].display();
        }
    }
}