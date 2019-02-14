package com.d2cmall.shopkeeper.common;

import com.d2cmall.shopkeeper.BuildConfig;

public final class Constants {

    //Api请求地址
    private static final String API_URL_ONLINE = "https://appserver.d2cmall.com";
    private static final String API_URL_DEV = "http://test4.d2cmall.com";
    public static final String API_URL = BuildConfig.DEBUG ? API_URL_DEV : API_URL_ONLINE;

    //分享地址
    private static final String SHARE_URL_ONLINE = "https://m.d2cmall.com";
    private static final String SHARE_URL_DEV = "https://test2.d2cmall.com";
    public static final String SHARE_URL = BuildConfig.DEBUG ? SHARE_URL_DEV : SHARE_URL_ONLINE;

    //支付回调地址
    private static final String PAY_URL_ONLINE = "http://open.api.d2cmall.com";
    private static final String PAY_URL_DEV = "http://test4.d2cmall.com";
    public static final String PAY_URL = BuildConfig.DEBUG ? PAY_URL_DEV : PAY_URL_ONLINE;

    public static final String INVOKE_URL = API_URL + "/v3/api/invoke/android?token=%1$s&url=%2$s&openInBrow";
    public static final String SCAN_URL = "http://app.d2cmall.com/download/d2cmall-install.apk";
    public static final String WEBP = "/format/webp";
    public static final String MY_SUFFIX = "SUFFIX";
    public static final String PHOTO_URL = "!/both/%1$sx%2$s";
    public static final String PHOTO_URL2 = "!/fw/%s/format/webp";
    public static final String VIDEO_PIC_URL = "!/fw/%s/format/webp/lossless/true";
    public static final String WULIU_URL = "/logistics/info?sn=%1$s&com=%2$s&productImg=%3$s";
    public static final String USER_AGENT_URL = " Ver/buyer-%1$s NetType/%2$s";
    public static final String IMG_HOST = "http://img.d2c.cn";
    public static final String VIDEO_HOST = "http://video.d2cmall.com";
    public static final String DEFAULT_AVATAR_URL = "http://d2c-app.b0.upaiyun.com/img/logo/android_default_avatar.png";
    public static final String APP_SECRET = "8811d44df3c0b408f6fa4a31002db44d";
    public static final String D2C_LOGO = "http://img.d2c.cn/app/a/16/05/10/fa55b70135c181482ae5c6d39c3277b1";
    public static final String detailWebUrl = "http://a.app.qq.com/o/simple.jsp?pkgname=com.d2cmall.buyer";

    public static final String TYPE_AVATAR = "a";
    public static final String TYPE_FRIEND = "f";
    public static final String TYPE_VIDEO = "v";
    public static final String TYPE_CUSTOMER = "c";


    public static final String DATE_FORMAT_LONG = "yyyy/MM/dd HH:mm:ss";
    public static final String DATE_FORMAT_LONG1 = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_SHORT = "yyyy/MM/dd";
    public static final String DATE_FORMAT_SHORT1 = "yyyy-MM-dd";
    public static final String DATE_FORMAT_MD = "MM/dd";
    public static final String DATE_FORMAT_HM = "HH:mm";
    public static final String DATE_FORMAT_MD_HM = "MM/dd HH:mm";
    public static final String DATE_FORMAT_MDHM = "MM月dd日 HH:mm";
    public static final String DATE_FORMAT_YMD = "yyyy年MM月dd日";

    //QQ、微信、微博
    public static final String QQKEY = "1104624486";
    public static final String WEIXINAPPID = "wxb74d14eb16859ed9";
    public static final String WEIXINSECRET = "d4624c36b6795d1d99dcf0547af5443d";

    public static final String WEIBOKEY = "1542490164";
    public static final String WEIBO_REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";
    public static final String WEIBO_SCOPE = "email,direct_messages_read,direct_messages_write,"
            + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
            + "follow_app_official_microblog," + "invitation_write";
    //支付宝
    public static final String ALIPAYPARTNER = "2088911603039004";
    public static final String ALIPAYSELLER = "payment@d2cmall.com";
    public static final String ALIPAYPRIVATEKEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBANq7q86K2n48CSBOCfkJ6Tzin1ZjKTx6cMgX5wu563LqHxf13AZTwP5f2dAGHJGhIOtMpDl1M2SfnjufDNKGY3CN39esWqwNLeo1t0CoqAfy7szyAK1IvvNcW+B8SyjQJel9WoZYpTYBrzIoCl+9MFTPMEuNyU1oQZs+idk8Jjx/AgMBAAECgYBJCfno0jz7ghiaDPUPj9uuVQ5XzmzqoQggCLtCEycoDD2txo9eHYGIb4FQEXpgtqlDaSg9d4FdzF8OEaI6el2hjcAPQmdx/JVbVA780f8U82DYK2D1EsSqUg1f3Zc1H1YYKDv6Mu48fFu9C6lPHuh0JaFWBqNd74Z8aCTXn1DD4QJBAPkb3bLUNINRQKDSUbf+XWybuYncn2hlhKD9g9eIVL+gNrW15cMrFxXYhQaBAeDI7qWfWFsAyASgW46TBjQs+5MCQQDgyLDPSX3+2Z85V3hnbCWPMavmX3mYXNXsdQid8LMjz07x5RQUa0tj55lAWFe6iAY2yoImFhiESS/LRrOJxUblAkAVuBpCR0I02Na7rtq1IhZfK8ynenbjkUZZCwF9v0M0WfGrMirQM2eV3gTrJkBVqu8zvYrklFLcJGcXLTZzQiDFAkBdOH2zCYx6I3BYDIF/iqcs8nGS0aeQ23dQX9zZ+1efkzrvMIyaR0D1xreUqs5/KihBksxU1TcHrX5ntAODMFBNAkEA7fMgZzREQ+LXZbnxhCOSvHM1Ug8xAMeglssfb0XrEdYq6SO6VqKAUw/HoZkFlKkc8KhV4SUq0Lu9OduZNMUsjg==";
    //微信支付
    public static final String WXMCHID = "1286659301";
    public static final String WXPARTNERID = "hkoughiuyfjhbvcdlou875412jh879ij";
    //又拍云
    public static final String UPYUN_KEY = "5LiKYAotpBipKnLJhV2IC3U2VG4=";
    public static final String UPYUN_SPACE = "d2c-pic";
    public static final String UPYUN_VIDEO_SPACE = "app-video";

    public static class ActionType {
        public static final int KEY_BACK = 1;
        public static final int UPLOAD_STATE = 2;
        public static final int UPLOAD_PROGRESS = 3;
        public static final int MAGIC_WINDOW = 4;
        public static final int ADD_CART_SUCCESS = 5;
        public static final int CLEAR_ALL_ACTIVITY = 6;
        public static final int REFRESH_CART = 7;
        public static final int CALCULTE_CART = 8;
        public static final int FINISH_CART = 9;
        public static final int CHANGE_PAGE = 10;
        public static final int CHANGE_PRODUCT_PAGE = 11;
        public static final int REFRESH_CART_COUNT = 12;
        public static final int HOME_UP = 13;
        public static final int HOME_UP_VISIABLE = 14;
        public static final int LIVE_LIST = 15;
        public static final int SPECAIL_UP = 16;
        public static final int MESSAGE_ALL_UNREANED_CHANGE = 17;
        public static final int XINREN=18;
        public static final int PARTENER_USER_INFO_CHANGE = 19;
        public static final int WXPAYRESULT=20;
    }

    public static class RequestCode {
    }

}