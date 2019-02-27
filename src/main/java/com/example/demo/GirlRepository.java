package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * GirlRepository
 *
 * @author hxx
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    /**
     * 通过年龄查询
     *
     * @param age age
     * @return List
     */
    List<Girl> findByAge(Integer age);
}
