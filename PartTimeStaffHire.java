/**
 * PartTimeStaffHire is created to hire staff for Part time.
 * @author Zenith Rajbhandari
 * @version 0.01
 */
public class PartTimeStaffHire extends StaffHire
{
    // declaring private instance variabel. 
    private int workingHour;
    private int wagesPerHour;
    private String staffName; 
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    public PartTimeStaffHire(int vacancyNum, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
        super(vacancyNum, designation, jobType); // calling constructors of super class StaffHire.
        this.workingHour=workingHour; //this keyword is used to refer to instance variable
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        staffName=""; //setting initial value to blank as staff hasnot joined yet
        joiningDate="";
        qualification="";
        appointedBy="";
        joined= false; // setting initial value to false
        terminated=false; // setting initial value to false
    }
    // Creating Accessor method
    // Creating getter method
    public String getNewShifts(){
        return shifts; // Returns value of private instance variable.
    }
    public String getStaffName(){
        return staffName;
    }
    public String getQualification(){
        return qualification;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public boolean getJoined(){
        return joined;
    }
    public boolean getTerminated(){
        return terminated;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    // creating setter method.
    public void setNewShifts(String shifts){
        if(joined == false){
            this.shifts=shifts;
            System.out.println("Shift has been changed to: " + getNewShifts());
        }
        else{
            System.out.println("Shift cannot be changed.");
        }
    }
    // to hire new staff
    public void hireNewStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if(joined == false){
            this.staffName=staffName; // to refer to instance variable and change the value.
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined = true; // to change boolean value to true.
            terminated=false; // to change boolean value to false if staff was terminated.
            System.out.println("New staff " + getStaffName() + " has been hired by " + getAppointedBy() + " on " + getJoiningDate());
        }
        else{
            System.out.println("Staff has already been hired so new staff cannot be hired.");
        }
    } 
    // to terminate staff
    public void terminateStaff(){
        if(terminated== false){
            joined = false; // to change boolean value to false after being terminated.
            terminated= true; // to change boolean value to true after being terminated.
            this.joiningDate=""; // to display blank content after being terminated.
            this.qualification="";
            this.appointedBy="";
            this.staffName="";
            System.out.println("Staff has been terminated.");
        }
        else{
            System.out.println("Staff cannot be terminated as staff has not been hired yet.");
        }
    }
    // to display the final output
    public void display(){
         super.display();
         if(joined==true){
           System.out.println("------------------------------------------------------------");
           System.out.println("Staff name : "+ getStaffName() + "\n");
           System.out.println("Joining Date : "+ getJoiningDate() + "\n");
           System.out.println("Qualification : "+ getQualification() + "\n");
           System.out.println("AppointedBy : "+ getAppointedBy() + "\n");
           System.out.println("Shift : "+ getNewShifts() + "\n");
           System.out.println("Income per day : " +(wagesPerHour*workingHour));
           System.out.println("------------------------------------------------------------");
           System.out.println("\t"+"\t"+"Staff has been hired now.");
         }
         else{
           System.out.println("------------------------------------------------------------");
           System.out.println("Staff has not been hired yet.");
           System.out.println("------------------------------------------------------------");
         }
    }
}
