package Allpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private int eid;
    private String ename;
    private String dname;
    private String euser;
    private String epass;
    private String sex;
    private String tel;
    private String qq;
    private String email;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date joindate;

}
