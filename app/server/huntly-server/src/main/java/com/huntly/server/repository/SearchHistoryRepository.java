package com.huntly.server.repository;

import com.huntly.server.domain.entity.SearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lcomplete
 */
@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory,Long>, JpaSpecificationExecutor<SearchHistory> {
    List<SearchHistory> findTop10ByOrderByIdDesc();
}
