package com.volcanno.spring.conditional;

/**
 * for linux
 *
 * @author vayne
 * @date 2020-02-23 15:18
 **/
public class LinuxListService implements SystemListService {
    @Override
    public String getListFileCmd() {
        return "ls";
    }
}
