package com.moli.proxy.staticproxy;

/**
 * @author moli
 * @time 2024-02-23 14:22:35
 * @description 代理类
 */
public class TeacherProxy implements ITeacherService {

    private final ITeacherService teacherService;

    public TeacherProxy(ITeacherService iTeacherService) {
        teacherService = iTeacherService;
    }

    @Override
    public void teach() {
        System.out.println("代理开始》。");
        teacherService.teach();
        System.out.println("代理结束");
    }
}
