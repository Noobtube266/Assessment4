package Assess;

public class CrewMember extends Person implements ServAble {

    public CrewMember(String name) {
        super(name);
    }
    private float salary;
    private FlightCrewJob job;

    public CrewMember(String name, float salary, FlightCrewJob job) {
        super(name);
        this.salary = salary;
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "salary=" + salary +
                ", job=" + job +
                '}';
    }
}
