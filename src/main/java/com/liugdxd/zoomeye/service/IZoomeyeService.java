package com.liugdxd.zoomeye.service;

import com.liugdxd.zoomeye.es.bo.ZoomeyeData;

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
     * @param zoomeyeData
     * @return
     */
    ZoomeyeData save(ZoomeyeData zoomeyeData);
}
