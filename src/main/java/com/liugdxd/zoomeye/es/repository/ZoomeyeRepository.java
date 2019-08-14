package com.liugdxd.zoomeye.es.repository;

import com.liugdxd.zoomeye.es.bo.Match;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>@ClassName ZoomeyeRepository</p>
 * <p>@description TODO</p>
 *
 * @author liugd
 * @version 1.0
 * @date 2019/8/13 17:10
 */
@Repository
public interface ZoomeyeRepository extends ElasticsearchRepository<Match, String> {

}
