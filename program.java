import java.util.ArrayList;


public class program {
    public static void main(String[] args) {
        ArrayList<Project> ProjectList = new ArrayList<Project>();
        Project p1 = new Project("Web A", "Developing a web application");
        Project p2 = new Project("Mobile app A", "Developing a mobile app");

        ProjectList.add(p1);
        ProjectList.add(p2);

        Employee E1 = new Employee();
        E1.setName("Tom");
        E1.setAge(1.0);
        E1.setPosition("UX/UI");
        E1.setEmpID("0001");
        Employee E2 = new Employee();
        E2.setName("Tim");
        E2.setAge(1.0);
        E2.setPosition("FrontEnd");
        E2.setEmpID("0002");

        E1.AddProject(p1);
        E1.AddProject(p2);

        E2.AddProject(p1);

        E1.ShowDetails();
        E2.ShowDetails();
    }
}

interface Person {
    public String getName();
    public void setName(String Name);
    public Double getAge();
    public void setAge(Double Age);
}

interface Job {
    public String getPosition();
    public void setPosition(String Position);
    public String getEmpID();
    public void setEmpID(String EmpID);

}


class Employee implements Person,Job{
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> Myproject;

    Employee() {
        this.Myproject = new ArrayList<Project>();
    }

    public void AddProject(Project Project) {
        this.Myproject.add(Project);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }
    
    @Override
    public Double getAge() {
        return Age;
    }
    
    public void setAge(double Age) {
        this.Age = Age;
    }

    @Override
    public String getPosition() {
        return Position;
    }
    
    @Override
    public void setPosition(String Position) {
        this.Position = Position;
    }
    
    @Override
    public String getEmpID(){
        return EmpID;
    }
    
    @Override
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    @Override
    public void setAge(Double Age) {
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }


    public void ShowDetails() {
        int daisies = 16;
         for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("Name : " + this.Name);
        System.out.println("Position : " + this.Position);
        System.out.println("EmpID : " + this.EmpID);
        System.out.println("Projects");

        for (int i = 0; i < this.Myproject.size(); i++) {
            System.out.println("    "+this.Myproject.get(i).getProject());
        }

    }
}

class Project extends Employee{
    private String projectName;
    private String Description;

    Project(String projectName, String Description) {
        super();
        this.projectName = projectName;
        this.Description = Description;
    }

    public String getProject() {
        return  projectName + " : " + Description;
    }
}
