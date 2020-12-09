package Allpojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Student {
    private int uid;
    private String uname;
    private String sex;
    private String tel;
    private String email;
    private String schoolTag;
    private String eduback;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date borndate;
    private String QQ;
    private String IDcard;
    private String password;
    private String cname;

    @Override
    public String toString() {
        return "Student{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", schoolTag='" + schoolTag + '\'' +
                ", eduback='" + eduback + '\'' +
                ", birthday=" + birthday +
                ", borndate=" + borndate +
                ", QQ='" + QQ + '\'' +
                ", IDcard='" + IDcard + '\'' +
                ", password='" + password + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int uid, String uname, String sex, String tel, String email, String schoolTag, String eduback, Date birthday, Date borndate, String QQ, String IDcard, String password, String cname) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.tel = tel;
        this.email = email;
        this.schoolTag = schoolTag;
        this.eduback = eduback;
        this.birthday = birthday;
        this.borndate = borndate;
        this.QQ = QQ;
        this.IDcard = IDcard;
        this.password = password;
        this.cname = cname;
    }

    public Student(String uname, String sex, String tel, String email, String schoolTag, String eduback, Date birthday, Date borndate, String QQ, String IDcard, String password, String cname) {
        this.uname = uname;
        this.sex = sex;
        this.tel = tel;
        this.email = email;
        this.schoolTag = schoolTag;
        this.eduback = eduback;
        this.birthday = birthday;
        this.borndate = borndate;
        this.QQ = QQ;
        this.IDcard = IDcard;
        this.password = password;
        this.cname = cname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchoolTag() {
        return schoolTag;
    }

    public void setSchoolTag(String schoolTag) {
        this.schoolTag = schoolTag;
    }

    public String getEduback() {
        return eduback;
    }

    public void setEduback(String eduback) {
        this.eduback = eduback;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
