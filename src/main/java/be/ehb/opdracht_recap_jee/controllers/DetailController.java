package be.ehb.opdracht_recap_jee.controllers;

import be.ehb.opdracht_recap_jee.model.Product;
import be.ehb.opdracht_recap_jee.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailController {
    @Autowired
    ProductDAO dao;
    @ModelAttribute (value = "all")
    public Iterable<Product> findall(){return dao.findAll();}

    @RequestMapping(value={"/details/{id}"}, method = RequestMethod.GET )
    public String findById (ModelMap map ,@PathVariable("id") int id){
        map.addAttribute("details",dao.findById(id).get());

        return "details";}



}
