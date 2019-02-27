package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * GirlService
 *
 * @author hxx
 */
@Service
public class GirlService {

    /**
     * GirlRepository
     */
    @Autowired
    private GirlRepository girlRepository;

    /**
     * insertTwo
     */
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);


        Girl girlB = new Girl();
        girlB.setCupSize("F");
        girlB.setAge(19);
//        System.out.println(1/0);
        girlRepository.save(girlB);

    }
}
