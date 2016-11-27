package com.adhib.arfan.belajar.spring.mvc.controller;

import com.adhib.arfan.belajar.spring.mvc.domain.Barang;
import com.adhib.arfan.belajar.spring.mvc.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by adhibarfan on 11/27/16.
 */
@Controller
public class BarangController {

    @Autowired
    private BarangService barangService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("barangs", barangService.getBarangs());
        return "index";
    }

    @RequestMapping(value = "/tambahBarang", method = RequestMethod.GET)
    public String tambahBarang(Model model) {
        model.addAttribute("barang", new Barang());
        return "addBarang";
    }


    @RequestMapping(value = "/simpanBarang", method = RequestMethod.POST)
    public String simpanBarang(@ModelAttribute("barang") Barang barang) {
        barangService.save(barang);
        return "redirect:/";
    }

    @RequestMapping(value = "/editBarang/{idBarang}", method = RequestMethod.GET)
    public String editBarang(Model model, @PathVariable("idBarang") String idBarang) {
        model.addAttribute("barang", barangService.getBarang(idBarang));
        return "editBarang";
    }

    @RequestMapping(value = "/updateBarang", method = RequestMethod.POST)
    public String updateBarang(@ModelAttribute("barang") Barang barang) {
        barangService.update(barang);
        return "redirect:/";
    }


    @RequestMapping(value = "hapusBarang/{idBarang}", method = RequestMethod.GET)
    public String hapusBarang(@PathVariable("idBarang") String idBarang) {
        Barang barang = barangService.getBarang(idBarang);
        barangService.delete(barang);
        return "redirect:/";
    }

}
