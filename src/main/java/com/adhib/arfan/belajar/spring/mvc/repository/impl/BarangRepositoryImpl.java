package com.adhib.arfan.belajar.spring.mvc.repository.impl;

import com.adhib.arfan.belajar.spring.mvc.domain.Barang;
import com.adhib.arfan.belajar.spring.mvc.repository.BarangRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by adhibarfan on 11/27/16.
 */
@Repository
public class BarangRepositoryImpl implements BarangRepository {


    @Autowired
    private SessionFactory sessionFactory;

    public void save(Barang barang) {
        sessionFactory.getCurrentSession().save(barang);
    }

    public void update(Barang barang) {
        sessionFactory.getCurrentSession().update(barang);

    }

    public void delete(Barang barang) {
        sessionFactory.getCurrentSession().delete(barang);
    }

    public Barang getBarang(String idBarang) {

        return sessionFactory.getCurrentSession().get(Barang.class, idBarang);
    }

    public List<Barang> getBarangs() {
        return sessionFactory.getCurrentSession().createQuery("from Barang b").getResultList();
    }
}
