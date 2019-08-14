package com.liugdxd.zoomeye.service;

import com.liugdxd.zoomeye.es.bo.Match;

import java.util.List;

/**
 * <p>@ClassName ZoomeyeService</p>
 * <p>@description TODO</p>
 *
 * @author liugd
 * @version 1.0
 * @date 2019/8/13 17:38
 */
public interface IZoomeyeService {

    /**
     * 保存ZoomeyeData到es
     * @param match
     * @return
     */
    Match save(Match match);

    /**
     * 批量查询匹配数据
     * @param matches
     * @return
     */
    long bathSave(List<Match> matches);
}
