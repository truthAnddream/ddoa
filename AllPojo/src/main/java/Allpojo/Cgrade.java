package Allpojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Cgrade implements Serializable {
    private int cid;
    private String cname;
    private String sname;
    private double cnumber;
    private double cweek;
    private String caddr;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
//    private Date cstartdate;




}
