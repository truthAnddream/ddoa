package Allpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private int sid;
    private String sname;
    private String weeknum;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date begindate;
    private String types;
}
