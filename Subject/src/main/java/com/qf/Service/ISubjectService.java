package com.qf.Service;



import Allpojo.Subject;

import java.util.List;

public interface ISubjectService {
    List<Subject> getAllSubject();
    Subject getSubjectBySid(int sid);
    boolean deleteSubjectBySid(int sid);
    boolean updateSubject(Subject subject);
    boolean saveSubject(Subject subject);
}
