package com.adhib.arfan.belajar.spring.mvc.service.impl;

import com.adhib.arfan.belajar.spring.mvc.domain.Barang;
import com.adhib.arfan.belajar.spring.mvc.repository.BarangRepository;
import com.adhib.arfan.belajar.spring.mvc.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by adhibarfan on 11/27/16.
 */

@Service
@Transactional(readOnly = true)
public class BarangServiceImpl implements BarangService {


    @Autowired
    private BarangRepository barangRepository;

    @Transactional
    public void save(Barang barang) {
        barangRepository.save(barang);
    }

    @Transactional
    public void update(Barang barang) {
        barangRepository.update(barang);
    }

    @Transactional
    public void delete(Barang barang) {
        barangRepository.delete(barang);
    }

    public Barang getBarang(String idBarang) {
        return barangRepository.getBarang(idBarang);
    }

    public List<Barang> getBarangs() {
        return barangRepository.getBarangs();
    }
}
