package com.qf.service;


import Allpojo.Massage;

import java.util.List;

public interface MassageService {
    List<Massage> GetAllMassage(int deleteid);
    int MoveMassage(int deleteid,int eid);
    int delete(int eid);
    int Update(Massage massage);
}
