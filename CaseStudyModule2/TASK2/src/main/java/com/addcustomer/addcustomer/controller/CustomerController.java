package com.addcustomer.addcustomer.controller;

import com.addcustomer.addcustomer.entity.CustomerEntity;
import com.addcustomer.addcustomer.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    customerService customerService;
    @GetMapping("/")
    public String list(Model model) { ;
        return "list";
    }


    @GetMapping("/addNewCustomer")
    public String add(Model model) {
        CustomerEntity u = new CustomerEntity();
        model.addAttribute("CUSTOMER", u);
        model.addAttribute("ACTION", "save");
        return "form";
    }


    @GetMapping("/search")
    public String search(@RequestParam(required=false,name="name") String name, Model model) {
        if (StringUtils.isEmpty(name)) {
            return "list";
        }
        model.addAttribute("CUSTOMER", customerService.search(name));
        return "list";
    }



    @PostMapping("/save")
    public String list(ModelMap model, @ModelAttribute("CUSTOMER") CustomerEntity customerEntity)
    {
        customerService.save(customerEntity);
        model.addAttribute("CUSTOMER", customerService.findAll());
        return "list";

    }

    @RequestMapping("/edit/{id}")
    public String edit(ModelMap model,
                       @PathVariable("id") Integer id) {
//        userDAO dao = new userDAO();
//        User u = dao.findByUsername(username);
        Optional<CustomerEntity> customerEntity = customerService.findById(id);
        if (customerEntity.isPresent()) {
            model.addAttribute("CUSTOMER", customerEntity.get());
        } else {
            model.addAttribute("CUSTOMER", new CustomerEntity());
        }
        model.addAttribute("CUSTOMER", customerEntity);
        model.addAttribute("ACTION", "/save");
        return "form";
    }

    @RequestMapping("/delete/{id}")

    public String delete(ModelMap model,
                         @PathVariable("id") Integer id) {
//        userDAO dao = new userDAO();
//        dao.delete(username);
        customerService.deleteById(id);
        model.addAttribute("CUSTOMER", customerService.findAll());

        return "redirect:/";
    }

    @ModelAttribute(name = "ALLCUSTOMER")
    public List<CustomerEntity> getAllCustomer(){
        return customerService.findAll();
    }

//    @RequestMapping("/list")
//    public String list(ModelMap model) {
////        userDAO dao = new userDAO();
////        model.addAttribute("USER", dao.getAll());
//        model.addAttribute("CUSTOMER", customerService.findAll());
//        return "list";
//    }

}
