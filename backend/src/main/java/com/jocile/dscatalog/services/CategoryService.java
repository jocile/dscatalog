package com.jocile.dscatalog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jocile.dscatalog.dto.CategoryDTO;
import com.jocile.dscatalog.entities.Category;
import com.jocile.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository repository;

  @Transactional(readOnly = true)
  public List<CategoryDTO> findAll() {
    List<Category> list = repository.findAll();

    List<CategoryDTO> listDTO = new ArrayList<>();
    for (Category cat : list) {
      listDTO.add(new CategoryDTO(cat));
    }
    return listDTO;
  }
}
