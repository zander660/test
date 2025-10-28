class Course {
    protected String courseName;
    protected String instructor;
    protected int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Instructor: " + instructor + ", Credits: " + credits);
    }
}

class OnlineCourse extends Course {
    private String platform;
    private int duration;

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    public boolean eligibleForCertificate() {
        return duration >= 4;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + ", Duration: " + duration + " weeks");
        System.out.println("Certificate Eligible: " + eligibleForCertificate());
    }

    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse("Java Programming", "Mr. Lee", 3, "Udemy", 5);
        oc.displayDetails();
    }
}
