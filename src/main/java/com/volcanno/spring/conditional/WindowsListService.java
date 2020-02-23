package com.volcanno.spring.conditional;

/**
 * @author vayne
 * @date 2020-02-23 15:18
 **/
public class WindowsListService implements SystemListService {
    @Override
    public String getListFileCmd() {
        return "dir";
    }
}
