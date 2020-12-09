package com.qf.service;



import Allpojo.Cgrade;

import java.util.List;

public interface ICgradeService {

    List<Cgrade> getAllCgrade();

    boolean saveCgrade(Cgrade c);

    Cgrade selectCrade(int uid);

    boolean deleteCrade(int cid);

    boolean updateCrade(Cgrade c);
}
