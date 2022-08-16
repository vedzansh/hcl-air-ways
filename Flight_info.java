
public class Flight_info {
    private String f_code;
    private String f_name;
    private String src;
    private String dst;

    public Flight_info(String f_code, String f_name, String src, String dst) {
        this.f_code = f_code;
        this.f_name = f_name;
        this.src = src;
        this.dst = dst;
    }

    public String getf_code() {
        return this.f_code;
    }

    public String getf_name() {
        return this.f_name;
    }

    public String getsrc() {
        return this.src;
    }

    public String getdst() {
        return this.dst;
    }

    public void setf_code(String f_code) {
        this.f_code = f_code;
    }

    public void setf_name(String f_name) {
        this.f_name = f_name;
    }

    public void setsrc(String src) {
        this.src = src;
    }

    public void setdst(String dst) {
        this.dst = dst;
    }

}
