package com.jovicsantos.suneverapi.application.dto;

import java.util.List;

public record RecipeDto(String name, String description, String imageLink, Integer portions,
                List<RecipeIngredientsDto> ingredients) {
}