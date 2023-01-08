package com.jovicsantos.suneverapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jovicsantos.suneverapi.models.Ingredient;
import com.jovicsantos.suneverapi.repositories.IngredientRepository;

@Service
public class IngredientService {
  @Autowired
  IngredientRepository ingredientRepository;

  public boolean existsByName(String name) {
    return ingredientRepository.existsByName(name);
  }

  public Ingredient save(Ingredient ingredientModel) {
    return ingredientRepository.save(ingredientModel);
  }

  public Iterable<Ingredient> findAll() {
    return ingredientRepository.findAll();
  }
}