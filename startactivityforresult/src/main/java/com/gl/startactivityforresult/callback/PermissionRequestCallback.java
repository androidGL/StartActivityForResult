package com.gl.startactivityforresult.callback;

/**
 * @Author: gelan
 * @CreateDate: 2020/8/4 10:54
 * @Description:
 */
public interface PermissionRequestCallback {
    void onRefused(String permission);
    void onAgree();
}
