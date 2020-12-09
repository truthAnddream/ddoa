package com.qf.Service.Impl;

import Allpojo.Subject;
import com.qf.Service.ISubjectService;
import com.qf.dao.subjectdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SubjectServiceImpl implements ISubjectService {
    @Autowired
    private subjectdao subjectDaos;
    @Override
    public List<Subject> getAllSubject() {
        return subjectDaos.getAllSubject();
    }

    @Override
    public Subject getSubjectBySid(int sid) {
        return subjectDaos.getSubjectBySid(sid);
    }

    @Override
    public boolean deleteSubjectBySid(int sid) {
        return subjectDaos.deleteSubjectBySid(sid)>0;
    }

    @Override
    public boolean updateSubject(Subject subject) {
        return subjectDaos.updateSubject(subject)>0;
    }

    @Override
    public boolean saveSubject(Subject subject) {
        return subjectDaos.saveSubject(subject)>0;
    }
}
