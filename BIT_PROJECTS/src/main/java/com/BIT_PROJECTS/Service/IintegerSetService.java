package com.BIT_PROJECTS.Service;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.IntegerSet;

public interface IintegerSetService {


    IntegerSet unionIntegerSet(IntegerSet otherSet1, IntegerSet otherSet2);

    IntegerSet intersectionIntegerSet(IntegerSet otherSet1, IntegerSet otherSet2);

    void insertElement(int k);

    void deleteElement(int m);

    Mensaje equalTo(IntegerSet otherSet1, IntegerSet otherSet2);



}
