/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422232.repository;

import com.mycompany.pert5_50422232.model.ModelMahasiswa;
import java.util.List;


/**
 *
 * @author AnnaufalA
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {

    public List<ModelMahasiswa> findAll();
}

