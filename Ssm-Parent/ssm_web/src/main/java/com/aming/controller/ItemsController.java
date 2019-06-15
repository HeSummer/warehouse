package com.aming.controller;

import com.aming.pojo.Items;
import com.aming.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    //展示商品信息页面
    @RequestMapping("/showItem")
    public String showItem(Integer id, Model model){
        Items items = itemsService.findItems(id);
        System.out.println("----------------------------------");
        System.out.println(items);
        model.addAttribute("item",items);
        return "viewItem";
    }


}
