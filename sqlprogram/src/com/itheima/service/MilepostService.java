package com.itheima.service;
import com.itheima.domain.Milepost;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MilepostService {
    public Milepost insertMilepostInfo() throws ParseException {
        Milepost milepost = new Milepost();
        System.out.println("请输入里程碑信息");
        Scanner sc = new Scanner(System.in);
        System.out.print("里程碑名称：");
        milepost.setName(sc.next());
        System.out.print("发射时间（格式2023-10-15）：");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        milepost.setLaunchtime(formatter.parse(sc.next()));
        System.out.print("里程碑描述：");
        milepost.setDepict(sc.next());
        System.out.print("里程碑状态：");
        milepost.setState(sc.nextInt());
        return milepost;

}
