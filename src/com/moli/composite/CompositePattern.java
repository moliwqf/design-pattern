package com.moli.composite;

/**
 * @author moli
 * @time 2024-02-23 09:47:33
 * @description 组合模式
 */
public class CompositePattern {

    public static void main(String[] args) {

        Composite school = new Composite("学校");
        // 将学院加入到学校中
        for (int i = 0; i < 10; i++) {
            Composite college = new Composite("学院");
            // 将系加入到学院中
            for (int j = 0; j < 10; j++) {
                college.add(new Leaf("系" + j));
            }
            college.print();
            school.add(college);
        }
        school.print();
    }
}
