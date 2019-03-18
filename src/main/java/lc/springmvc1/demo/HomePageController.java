package lc.springmvc1.demo;


import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
class HomePageController {


    ArrayList<Product>lab = new ArrayList<>();

    public ArrayList<Product> getLab(){

        return lab;
    }


}
