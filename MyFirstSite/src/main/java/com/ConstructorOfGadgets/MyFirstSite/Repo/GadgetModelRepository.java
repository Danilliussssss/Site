package com.ConstructorOfGadgets.MyFirstSite.Repo;

import com.ConstructorOfGadgets.MyFirstSite.Models.GadgetModel;
import org.springframework.data.repository.CrudRepository;

public interface GadgetModelRepository extends CrudRepository<GadgetModel,Long> {
}
