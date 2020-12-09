package com.qf.dao;
import Allpojo.Subject;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface subjectdao {
    List<Subject> getAllSubject();
    Subject getSubjectBySid(int sid);
    int deleteSubjectBySid(int sid);
    int updateSubject(Subject subject);
    int saveSubject(Subject subject);
}
