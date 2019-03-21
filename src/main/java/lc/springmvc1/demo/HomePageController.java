package lc.springmvc1.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
class HomePageController {

   private ArrayList<Product> lab = new ArrayList<>();

    public ArrayList<Product> getlab() {
        return lab;
    }


    public void setLab(ArrayList<Product> lab) {
        this.lab = lab;

    }

    @GetMapping
    public String home(Model model){
        return "HomePage";


    }
}


