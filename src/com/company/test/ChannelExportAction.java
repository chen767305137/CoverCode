package com.company.test;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class ChannelExportAction {

    /**
     * 导出excel表请�?
     */
    public void exportQInfoExcel() throws IOException {
        //获取json数据

    }

    public void createExcel(List<Object[]> listResult, String fileName, String creatorName, String loginCom) throws Exception {
        OutputStream os = null;
        String[] title = {"订单�?", "投保人名�?", "被保险人名称", "车主", "车牌号码", "初次登记日期", "车架�?",
                "发动机号", "打印厂牌型号", "使用性质", "商业险净保费", "商业险税�?(%)", "商业险税�?", "车损保额", "车损保费", "三�?�保�?", "三�?�保�?", "车上人员/驾驶员保�?", "车上人员/驾驶员保�?",
                "车上人员/乘客保额", "车上人员/乘客保费", "盗抢保额", "盗抢保费", " 玻璃保费", "划痕保额"
                , "划痕保费", "发动机保�?", "自燃损失险保�?", "自燃损失险保�?", " 不计免赔保费", "奥运补偿减免",
                "其他险种", "商业险保费合�?", "手续费比�?%", "费率浮动系数", "保险起期", "保险止期", "核保状�??", "车船税金�?", "�?保费",
                "税率(%)", "税额", "交强险保�?", "交强险和车船税�?�计", "费率浮动系数", "业务�?", "业务标识",
                "业务类别", "代理人名�?"};

    }

    public void createExcelNew(List<Object[]> listResult, String fileName, String creatorName, String loginCom) throws Exception {
        OutputStream os = null;
        String[] title = {"订单�?", "投保单号", "�?保费", "税率(%)", "税额", "投保人名�?", "被保险人名称", "车主", "车主身份证号", "车牌号码", "初次登记日期", "车架�?",
                "发动机号", "打印厂牌型号", "使用性质", "厂牌型号", "车龄", "能源名称", "出险次数", "新车购置�?", "费率", "渠道系数", "自主核保系数", "无赔优系�?", "交�?�违法系�?",
                "车损（综合）保额", "车损（综合）保费", "机动车损失保险（IACJQL0001）保�?", "机动车损失保险（IACJQL0001）保�?", "三�?�保�?", "三�?�保�?", "车上人员/驾驶员保�?", "车上人员/驾驶员保�?",
                "车上人员/乘客保额", "车上人员/乘客保费", "盗抢保额", "盗抢保费", " 玻璃保费", "划痕保额"
                , "划痕保费", "发动机保�?", "自燃损失险保�?", "自燃损失险保�?", " 不计免赔保费", "奥运补偿减免",
                "绝对免赔率特约险保费", "车轮单独损坏除外特约险保�?", "新增设备（�?�用车损条款）保�?", "新增设备（�?�用车损条款）保�?", "三�?�假日翻倍保�?", "三�?�假日翻倍保�?", "无法找到第三方保险保�?",
                "其他险种", "保费合计", "车船税金�?", "手续费比�?%", "保险起期", "保险止期", "核保状�??",
                "关联交强险投保单�?", "�?保费", "税率(%)", "税额", "关联交强险保�?", "关联交强险车船税", "车险保费和车船税总计",
                "平台出险次数", "平台已决赔款金额", "业务�?", "业务标识", "业务类别", "代理人名�?", "费率浮动系数"};
    }
}