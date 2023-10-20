package com.kgisl.springmvccrud;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
    

@Controller
@Configuration
// @RequestMapping("/")
public class LaptopController {

@Autowired
LaptopDAO lapdao;


@RequestMapping("/lapform")
public String showForm(Model m)
{
      m.addAttribute("command", new Laptop());
      return "lapform";
}

@RequestMapping(value="/save" , method=RequestMethod.POST)
public String save(@ModelAttribute("lap") Laptop lap)
{
       lapdao.save(lap);
       return "redirect:/viewlap";
}

@RequestMapping("/viewlap")
public String viewlap(Model m)
{
    List<Laptop> listlap=lapdao.getLaptops();
    m.addAttribute("listlap", listlap);
    return "viewlap";
}

@RequestMapping("/editlap/{id}")
public String editlap(@PathVariable int id,Model m)
{
    Laptop laptop=lapdao.getLaptopById(id);
    m.addAttribute("command", laptop);
    return "lapeditform";
}

@RequestMapping(value="/editsave",method=RequestMethod.POST)

    public String editsave(@ModelAttribute("lap") Laptop lap)
    {
        lapdao.update(lap);
        return "redirect:/viewlap";
    }


@RequestMapping(value="/deletelap/{id}",method=RequestMethod.GET)
public String delete(@PathVariable int id)
{
    lapdao.delete(id);
    return "redirect:/viewlap";
}

}
