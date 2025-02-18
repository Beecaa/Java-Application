package chapter_8.composition;


public class Department {
    String departmentName;
    
    /**
     *
     * @param departmentName
     */
    public Department(String departmentName){
       this.departmentName = departmentName;
    }
    
    public String displayDepartment(){
        return departmentName;
    }
}
