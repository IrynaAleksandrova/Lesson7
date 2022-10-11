package job_title;

public class Worker implements Employees {

    private String emp;

    Worker(String emp) {
        this.emp = emp;
    }

    public void print() {
        System.out.println("Job title: " + emp);
    }
}