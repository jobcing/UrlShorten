package yejin.shortenURL.test.repositories;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import yejin.shortenURL.test.domains.ShortenUrl;

/**
 * 
 * @author yeeeah_j
 *
 */
@Repository
public interface ShortenUrlRepository extends JpaRepository<ShortenUrl, Long>{

}
