/**
 * StaffHire class is the super class. which is created fo getting information of staff about to be hired.
 *
 * @author (Zenith Rajbhandari)
 * @version (0.01)
 */
public class StaffHire
{
    // Declaring a instance protected variable.
    protected int vacancyNum; 
    protected String designation;
    protected String jobType;
    public StaffHire(int vacancyNum, String designation, String jobType){
        //this. keyword is used to refer to instance variable
        this.vacancyNum=vacancyNum;
        this.designation=designation;
        this.jobType=jobType;
    }
    // Accessor method 
    // constructing getter method
    public int getVacancyNum(){
        return vacancyNum; // Returns value of protected instance variable.
    }

    public String getJobType(){
        return jobType; 
    }

    public String getDesignation(){
        return designation; 
    }
    // constructing setter method
    public void setVacancyNum(int vacancyNum){
        this.vacancyNum=vacancyNum; // to refer to instance variable and change the value.
    }

    public void setJobType(String JobType){
        this.jobType=jobType; 
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }
    // to display the output
    public void display(){
        System.out.println("Vacany Number: "+ getVacancyNum());
        System.out.println("Designation: "+ getDesignation());
        System.out.println("Job Type: "+ getJobType());
    }
}
