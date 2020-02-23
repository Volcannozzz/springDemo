package com.volcanno.spring.conditional;

/**
 * @author vayne
 * @date 2020-2-23 15:17:16
 */
public interface SystemListService {
    /**
     * 得到系统下list文件的命令
     * @return dir or ls etc.
     */
    String getListFileCmd();
}
