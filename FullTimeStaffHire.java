/**
 * FullTimeStaffHire is creted to hire full time staff.
 *
 * @author Zenith Rajbhandari
 * @version 0.01
 */
public class FullTimeStaffHire extends StaffHire
{
    // declaaring private instance varaible
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public  FullTimeStaffHire(int vacancyNum, String designation, String jobType,int salary, int workingHour){
        super(vacancyNum,designation,jobType); // calling constructors of super class StaffHire.
        this.salary=salary; //this keyword is used to refer to instance variable
        this.workingHour=workingHour;
        staffName=""; //setting initial value to blank as staff hasnot joined yet
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    // Accessor and getter method
    //  constructing getter method
    public int getNewSalary(){
        return salary;
    }
    public int getNewWorkingHour(){
        return workingHour;
    }
    public String getStaffName(){
        return staffName;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getQualification(){
        return qualification;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public boolean getJoined(){
        return joined;
    }
    //constructing setter method
    public void setNewSalary(int salary){
        if(joined == false){
            this.salary=salary;
            System.out.println("Salary has been changed to: " + getNewSalary());
        }
        else{
            System.out.println("Salary cannot be changed.");
        }
    }
    public void setNewWorkingHour(int workingHour){
        this.workingHour=workingHour;
        System.out.println("Working hour has been changed to: " + getNewWorkingHour());
    }
    // to hire new staff
    public void hireNewStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if(joined== false){ 
            this.staffName=staffName; // to refer to instance variable and change the value.
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            System.out.println("New staff " + getStaffName() + " has been hired by " + getAppointedBy() + " on " + getJoiningDate());
            joined=true; // to change boolean value to true.
        }
        else{ 
            System.out.println("Staff has already been hired so new staff cannot be hired.");
        }
    }
    // to display the final output
    public void display(){
        super.display();
       if(joined==true){
           System.out.println("------------------------------------------------------------");
           System.out.println("Staff name: "+ getStaffName() + "\n");
           System.out.println("Joining Date: "+ getJoiningDate() + "\n");
           System.out.println("Qualification: "+ getQualification() + "\n");
           System.out.println("AppointedBy: "+ getAppointedBy() + "\n");
           System.out.println("Salary: "+ getNewSalary() + "\n");
           System.out.println("Working hour: "+ getNewWorkingHour());
           System.out.println("------------------------------------------------------------");
           System.out.println("\t"+"\t"+"Staff has now been hired.");
        }
        else{
           System.out.println("------------------------------------------------------------");
           System.out.println("Staff has not been hired yet.");
           System.out.println("------------------------------------------------------------");
        }
    }
}
