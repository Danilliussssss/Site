package com.ConstructorOfGadgets.MyFirstSite.Controllers;

import com.ConstructorOfGadgets.MyFirstSite.Models.GadgetModel;
import com.ConstructorOfGadgets.MyFirstSite.Repo.GadgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class Headphone {
    @Autowired
    private GadgetRepository gadgetRepository;
   @GetMapping("/EnterHead")
    public String EnterHead(Model model) {
        model.addAttribute("Ввод данных");
        return "EnterHead";
    }

    @PostMapping("/EnterHead")
    public String AddHeadphone(@RequestParam String name, @RequestParam int mAh, @RequestParam String TypeScreen, @RequestParam int Hz, Model model) {
        GadgetModel M = new GadgetModel(name, mAh, TypeScreen, Hz);
        var t = gadgetRepository.save(M);
        return "redirect:/Print/" + t.getId();
    }
   @GetMapping("/Print/{id}")
    public String Print(@PathVariable(value = "id") long id, Model model) {
        Optional<GadgetModel> optionalGadgetModel = gadgetRepository.findById(id);
        ArrayList<GadgetModel> arrayList = new ArrayList<>();
        arrayList.add(optionalGadgetModel.get());
        model.addAttribute("GadgetModelList", arrayList);
        return "Print";
    }
}
