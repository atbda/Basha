package springdi2;


class NiiT {
  
    private String Branch;
    private int Code;
    private String Course;
    private String Address;

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public NiiT(String Branch, int Code, String Course, String Address) {
        this.Branch = Branch;
        this.Code = Code;
        this.Course = Course;
        this.Address = Address;
    }

    
   
   

}
