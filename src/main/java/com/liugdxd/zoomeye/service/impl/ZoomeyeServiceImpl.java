package com.liugdxd.zoomeye.service.impl;

import com.liugdxd.zoomeye.es.bo.Match;
import com.liugdxd.zoomeye.es.repository.ZoomeyeRepository;
import com.liugdxd.zoomeye.service.IZoomeyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>@ClassName ZoomeyeServiceImpl</p>
 * <p>@description TODO</p>
 *
 * @author liugd
 * @version 1.0
 * @date 2019/8/13 17:39
 */
@Service
public class ZoomeyeServiceImpl implements IZoomeyeService {

    @Autowired
    private ZoomeyeRepository zoomeyeRepository;

    @Override
    public Match save(Match match) {
        return zoomeyeRepository.save(match);
    }

    @Override
    public long bathSave(List<Match> matches) {
        zoomeyeRepository.saveAll(matches);
        return zoomeyeRepository.count();
    }
}
