package com.yuntao.bookworm;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yangyun on 6/8/2018.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
