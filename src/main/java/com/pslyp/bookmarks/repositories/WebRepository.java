package com.pslyp.bookmarks.repositories;

import com.pslyp.bookmarks.entities.Web;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebRepository extends JpaRepository<Web,Integer> {

}
