package job_title;

public class Accountant implements Employees {

    private String emp;

    Accountant(String emp) {
        this.emp = emp;
    }

    public void print() {
        System.out.println("Job title: " + emp);
    }
}