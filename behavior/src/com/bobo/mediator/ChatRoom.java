package com.bobo.mediator;

import java.util.Date;

/**
 * Created by evildoerDb on 2018/7/19 15:42
 *
 *
 */
public class ChatRoom {

    public static void showMessage(User user , String message){
        System.out.println(new Date().toString()+" 消息来自 "+user.getName()+"消息内容是："+message);
    }
}
