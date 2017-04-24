package com.mining;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
public class Test {
    public static void main(String[] args) {
        WeChatMsg sw = new WeChatMsg();
        try {
            String token = sw.getToken("wx48550600b1a01730", "sYreGwLC6f4wZusDqynBPMpHYyg8s_-bJUQLdHGeOxUbHhvcMvBbOyZQZMZDwsrD");
//            String postdata = sw.createpostdata("@all", "text", 2, "content", "I love forever~~");
            String postdata = sw.createpostdata("521|qianzhiqin", "text", 2, "content", "I love you forever ~~");
            String resp = sw.post("utf-8", WeChatMsg.CONTENT_TYPE, (new UrlData()).getSendMessage_Url(), postdata, token);
            System.out.println("获取到的token======>" + token);
            System.out.println("请求数据======>" + postdata);
            System.out.println("发送微信的响应数据======>" + resp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
