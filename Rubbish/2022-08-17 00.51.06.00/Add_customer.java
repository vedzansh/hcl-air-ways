public class Add_customer {
    0 String pnr_no;
    0 String address;
    0 String nationality;
    0 String name;
    0 String gender;
    0 String ph_no;
    0 String passport_no;
    0 String fl_code;
    
    public Add_customer(String pnr_no, String address, String nationality, String name, String gender, String ph_no, String passport_no, String fl_code) {
        this.pnr_no = pnr_no;
        this.address = address;
        this.nationality = nationality;
        this.name = name;
        this.gender = gender;
        this.ph_no = ph_no;
        this.passport_no = passport_no;
        this.fl_code = fl_code;
    }

    public String getpnr_no() {
        return this.pnr_no;
    }

    public String getaddress() {
        return this.address;
    }

    public String getnationality() {
        return this.nationality;
    }

    public String getname() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public String getPh_no() {
        return ph_no;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public String getFl_code() {
        return fl_code;
    }

    public void setPnr_no(String pnr_no) {
        this.pnr_no = pnr_no;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public void setFl_code(String fl_code) {
        this.fl_code = fl_code;
    }
}