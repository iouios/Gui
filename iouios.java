import java.util.ArrayList;

public class iouios {
    public static void main(String[] args) {
        Employee A = new Employee("Tom", "UX/UI", "0001");
        Project project1 = new Project("Web A : Developing a web application");
        Project project2 = new Project("Mobile app A : Developing a mobile app");

        A.addProject(project1);
        A.addProject(project2);
        
        System.out.println("Name: " + A.getName());
        System.out.println("EmpID: " + A.getEmpID());
        System.out.println("Position: " + A.getPosition());
        

        System.out.println("Employee's Projects:");
        for (Project project : A.getMyProjects()) {
            System.out.println(" - " + project.getProjectName());
        }


        Employee B = new Employee("Tim", "FontEnd", "0002");
        Project project3 = new Project("Web A : Developing a web application");

        B.addProject(project3);
    
        System.out.println("Name: " + B.getName());
        System.out.println("EmpID: " + B.getEmpID());
        System.out.println("Position: " + B.getPosition());

        System.out.println("Employee's Projects:");
        for (Project project : B.getMyProjects()) {
            System.out.println(" - " + project.getProjectName());

        }
    }
}

class Employee {
    private String Name;
    private Double Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project>myProjects;

    public Employee(String Name , String Position , String EmpID) {
        this.Name = Name;
        this.Position = Position;
        this.EmpID = EmpID;
        this.myProjects = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setAge(String EmpID) {
        this.EmpID = EmpID;
    }

    public ArrayList<Project> getMyProjects() {
        return myProjects;
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }
    
}
class Project {
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}

