package com.liugdxd.zoomeye.service.impl;

import com.liugdxd.zoomeye.es.bo.ZoomeyeData;
import com.liugdxd.zoomeye.es.repository.ZoomeyeRepository;
import com.liugdxd.zoomeye.service.IZoomeyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ZoomeyeData save(ZoomeyeData zoomeyeData) {
        return zoomeyeRepository.save(zoomeyeData);
    }
}
