package cn.edu.nuc.ssm.entity;

public class Student {
    private Integer stuId;

    private String stuname;

    private String address;

    private String stuphone;

    private Integer blance;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }

    public Integer getBlance() {
        return blance;
    }

    public void setBlance(Integer blance) {
        this.blance = blance;
    }

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuname=" + stuname + ", address=" + address + ", stuphone=" + stuphone
				+ ", blance=" + blance + "]";
	}
    
    
    
}