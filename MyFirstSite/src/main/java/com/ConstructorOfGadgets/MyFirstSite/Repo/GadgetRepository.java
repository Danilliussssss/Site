package com.ConstructorOfGadgets.MyFirstSite.Repo;

import com.ConstructorOfGadgets.MyFirstSite.Models.GadgetModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GadgetRepository extends JpaRepository<GadgetModel,Long> {
}
