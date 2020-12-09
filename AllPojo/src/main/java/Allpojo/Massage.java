package Allpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Massage {
    private int eid;
    private String ename;
    private String dname;
    private String sex;
    private Integer tel;
    private String rdesc;
    private int deleteid;

}
