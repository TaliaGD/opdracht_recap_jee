package be.ehb.opdracht_recap_jee.controllers;

import be.ehb.opdracht_recap_jee.model.Product;
import be.ehb.opdracht_recap_jee.model.ProductDAO;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.validation.Valid;

@Controller
public class IndexController {
    @Autowired
    ProductDAO dao;

    @ModelAttribute(value="all")
    public Iterable<Product> findAll(){
        return dao.findAll();
    }

   @RequestMapping(value = {"id"}, method = RequestMethod.GET)
   public String findById(@PathVariable("id") int id, ModelMap map) {
       map.addAttribute( "Id", dao.findById(id).get());
       return "detail";
   }




    //model atribute voor één nieuw product
    @ModelAttribute(value = "nProduct")
    public Product producttoSave(){
        return new Product();
    }
    // voor de index pagina
    @RequestMapping(value = {"","/","/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map){
        return "index";
    }
    //voor de details pagina
    @RequestMapping(value = {"/details"}, method = RequestMethod.GET)
    public String showDetails(ModelMap map) {
        return "details";
    }
    //voor new pagina
    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String showNew(ModelMap map) {
        return "new";
    }
    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String showAbout(ModelMap map) {
        return "about";
    }
    //voor new pagina
    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String saveProduct (@ModelAttribute("nProduct")@Valid Product nProduct, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "new";
        dao.save(nProduct);
        return "redirect:/new";
    }

}
