package com.recipes.recipebrewer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.recipes.recipebrewer.Model.ShoppingList;
import com.recipes.recipebrewer.service.ShoppingListServiceImpl;

@Controller
public class ShoppingListController {
    @Autowired
    private ShoppingListServiceImpl shoppingListRepo;

    @GetMapping("/shoppingList")
    public String getShoppingList(Model model){
        model.addAttribute("shoppingList", shoppingListRepo.getShoppingLists());
        return "shoppingList";
    }

    @GetMapping("/myShoppingList")
    public String myShoppingList(@SessionAttribute("id") Long id, Model model){
        model.addAttribute("myShoppingList", shoppingListRepo.findAllByAuthor(id));
        return "myShoppingList";
    }

    @GetMapping("/createShoppingList")
    public String addShoppingList(Model model, @RequestParam(required = false) Long id){
        model.addAttribute("shoppingList", new ShoppingList());
        return "createShoppingList";
    }

    @GetMapping("/updateShoppingList/{id}")
    public String showUpdate(@PathVariable(value = "id") Long id, Model model){
        ShoppingList updateShoppingList = shoppingListRepo.getShoppingList(id);
        model.addAttribute("shoppingList", updateShoppingList);
        return "createShoppingList";
    }

    @PostMapping("/saveShoppingList")
    public String saveShoppingList(@ModelAttribute ShoppingList shoppingList){
        shoppingListRepo.saveShoppingList(shoppingList);
        return "redirect:/shoppingList";
    }

    @GetMapping("/deleteShoppingList")
    public String deleteShoppingList(@RequestParam Long id){
        shoppingListRepo.deleteShoppingList(id);
        return "redirect:/shoppingList";
    }

}
