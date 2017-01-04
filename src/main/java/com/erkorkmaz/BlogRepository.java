package com.erkorkmaz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BlogRepository extends JpaRepository<Blog, Long> {
}