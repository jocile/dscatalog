package com.jocile.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jocile.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
