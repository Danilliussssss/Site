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
public class Notebook {
    @Autowired
    private GadgetRepository gadgetRepository;
    @GetMapping("/EnterNotebook")
    public String EnterNote(Model model) {
        model.addAttribute("Ввод данных");
        return "EnterNotebook";
    }

    @PostMapping("/EnterNotebook")
    public String AddNotebook(@RequestParam String name, @RequestParam int mAh, @RequestParam String TypeScreen, @RequestParam int Hz,String ProcessorName,int GHz, Model model) {
        GadgetModel M = new GadgetModel(name, mAh, TypeScreen, Hz,ProcessorName,GHz);
        var t = gadgetRepository.save(M);
        return "redirect:/PrintNote/" + t.getId();
    }
    @GetMapping("/PrintNote/{id}")
    public String Print(@PathVariable(value = "id") long id, Model model) {
        Optional<GadgetModel> optionalGadgetModel = gadgetRepository.findById(id);
        ArrayList<GadgetModel> arrayList = new ArrayList<>();
        arrayList.add(optionalGadgetModel.get());
        model.addAttribute("GadgetModelList", arrayList);
        return "PrintNote";
    }
}

