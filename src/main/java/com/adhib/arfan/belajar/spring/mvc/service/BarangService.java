package com.adhib.arfan.belajar.spring.mvc.service;

import com.adhib.arfan.belajar.spring.mvc.domain.Barang;

import java.util.List;

/**
 * Created by adhibarfan on 11/27/16.
 */

public interface BarangService {

    void save(Barang barang);

    void update(Barang barang);

    void delete(Barang barang);

    Barang getBarang(String idBarang);

    List<Barang> getBarangs();
}
